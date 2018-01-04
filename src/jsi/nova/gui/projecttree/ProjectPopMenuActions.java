/**
 * 
 */
package jsi.nova.gui.projecttree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import jsi.nova.gui.panel.ProjectTreePanel;
import jsi.nova.util.Constants;

/**
 * @ClassName:     ProjectPopMenuActions.java
 * @Description:   �Ҽ�project�����Ĳ˵�����Ӧ�ĸ��ֲ���
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��13�� ����7:58:06 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ProjectPopMenuActions {
    
    private static JTree tree = ProjectTreePanel.getProject_tree();
    
    public static class addGraphListener implements ActionListener {
        private ProjectTreeNode node;

        public addGraphListener(ProjectTreeNode node) {
            this.node = node;
        }

        public void actionPerformed(ActionEvent e) {
            try {
                addGraphTreeNode(node);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static class deleteProjectListener implements ActionListener {
        private ProjectTreeNode node;

        public deleteProjectListener(ProjectTreeNode node) {
            this.node = node;
        }

        public void actionPerformed(ActionEvent e) {
            deleteProject(node);
        }
    }
    //�½�һ��GraphTreeNode�����Ӧ���ļ�
    public static void addGraphTreeNode(ProjectTreeNode node) throws IOException {
        //�½�GraphTreeNode
        GraphTreeNode graphnode = new GraphTreeNode("graph" + node.getGraphNumber());
        //����GraphTreeNode��Ӧ���ļ������½��ļ�
        String path = node.getProjectPath();
        File graphFile = new File(path, "graph" + node.getGraphNumber() + ".jg");
        node.setGraphNumber(node.getGraphNumber() + 1);
        graphnode.setGraphFile(graphFile.getAbsolutePath());
        try {
            graphFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //���ļ�д�����ݣ��½�һ�ſհ�ͼ
        FileWriter fw = new FileWriter(graphFile);
        StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<java version=\"1.8.0_144\" class=\"java.beans.XMLDecoder\">\n");
        sb.append(" <array class=\"java.lang.Object\" length=\"0\"/>\n");
        sb.append("</java>\n");
        fw.write(sb.toString());
        fw.close();
        node.add(graphnode);
        //ˢ��tree
        tree.updateUI();
    }
    //ɾ��һ����Ŀ��������Ӳ����ɾ��
    public static void deleteProject(ProjectTreeNode node) {
        int resutlt = JOptionPane.showConfirmDialog(null, "ȷ��ɾ������Ŀ?");
        switch (resutlt) {
        case 0:
            DefaultMutableTreeNode root = (DefaultMutableTreeNode) tree.getModel().getRoot();
            root.remove(node);
            tree.updateUI();            
            break;
        default:
            break;

        }
    }

}
