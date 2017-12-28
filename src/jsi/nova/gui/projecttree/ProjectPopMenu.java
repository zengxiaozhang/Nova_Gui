/**
 * 
 */
package jsi.nova.gui.projecttree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultMutableTreeNode;

import jsi.nova.util.Constants;

/**
 * @ClassName:     ProjectPopMenu.java
 * @Description:   �Ҽ�project�����Ĳ˵� 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��8�� ����3:24:11 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ProjectPopMenu extends JPopupMenu{
    
    private JMenuItem newGraph;
    private JMenuItem deleteProject;
    private ProjectTreeNode node;

    public ProjectPopMenu(ProjectTreeNode node) {
        // TODO Auto-generated constructor stub
        this.node = node;
        newGraph = new JMenuItem("�½�����ͼ");
        deleteProject = new JMenuItem("ɾ����Ŀ");
        //
        newGraph.addActionListener(new ProjectPopMenuActions.addGraphListener(node));
        //
        deleteProject.addActionListener(new ProjectPopMenuActions.deleteProjectListener(node));
        //
        this.add(newGraph);
        this.addSeparator();
        this.add(deleteProject);
    }
}
