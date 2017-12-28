/**
 * 
 */
package jsi.nova.gui.projecttree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import com.mxgraph.view.mxGraph;

import jsi.nova.util.Constants;

/**
 * @ClassName:     GraphPopMenuActions.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         GraphPopMenu ����Ӧ�Ĳ���
 * @version        V1.0  
 * @Date           2017��12��13�� ����8:17:47 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphPopMenuActions {
    private static File tmp;
    private static File old;

    public static class OpenGraphListener implements ActionListener {
        private GraphTreeNode node;

        public OpenGraphListener(GraphTreeNode node) {
            // TODO Auto-generated constructor stub
            this.node = node;
        }

        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            try {
                if (ifSaved()) {
                    openGraphFile(node);
                }
                ;
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    public static class SaveGraphListener implements ActionListener {
        private GraphTreeNode node;

        public SaveGraphListener(GraphTreeNode node) {
            // TODO Auto-generated constructor stub
            this.node = node;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            try {
                saveGraphFile();
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }
    
    public static class RunGraphListener implements ActionListener{
        private GraphTreeNode node;

        public RunGraphListener(GraphTreeNode node) {
            // TODO Auto-generated constructor stub
            this.node = node;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            try {
                saveGraphFile();
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            RunWorkFlow.run(node);
            editMonitorArea();
        }
        
    }
    //���ļ�
    public static void openGraphFile(GraphTreeNode node) throws FileNotFoundException {
        //IfChangedGraph graph = new IfChangedGraph();
        mxGraph graph = new mxGraph();
        File graphFile = new File(node.getGraphFile());
        //ConstantsRepository.OPENDGRAPH.put(graphFile.getAbsolutePath(), graph);
        //���õ�ǰ���ļ�����ʾ��ͼ
        Constants.CURRENTWORKINGFILE = graphFile.getAbsolutePath();
        Constants.CURRENTWORKINGGRAPH = graph;
        //��ȡ�ļ����½�graph
        XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(graphFile)));
        //System.out.println(xmlDecoder.readObject().toString());
        Object[] cells = (Object[]) xmlDecoder.readObject();
        for (Object cell : cells) {
            graph.addCell(cell);
        }
        xmlDecoder.close();
        //����graphcomponent
        Constants.graphComponent.setVisible(true);
        Constants.graphComponent.setGridVisible(true);
        Constants.graphComponent.setGraph(graph);
        Constants.graphComponent.updateUI();
    }

    public static void saveGraphFile() throws FileNotFoundException {
        if (Constants.CURRENTWORKINGGRAPH != null && Constants.CURRENTWORKINGFILE != null) {
            XMLEncoder xmlEncoder = new XMLEncoder(
                    new BufferedOutputStream(new FileOutputStream(new File(Constants.CURRENTWORKINGFILE))));
            Object[] cells = Constants.graphComponent.getCells(Constants.graphComponent.getBounds());
            xmlEncoder.writeObject(cells);
            xmlEncoder.close();
            JOptionPane.showMessageDialog(null, "����ɹ�");
        }
    }

    //�ж��Ƿ��޸Ĺ�
    public static Boolean graphChanged(String path, mxGraph graph) throws IOException {
        //�½���ʱ�ļ�
        tmp = new File(path + ".tmp");
        tmp.createNewFile();
        //�ѵ�ǰ��ͼ�浽��ʱ�ļ���
        XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(tmp)));
        Object[] cells = Constants.graphComponent.getCells(Constants.graphComponent.getBounds());
        xmlEncoder.writeObject(cells);
        xmlEncoder.close();
        old = new File(path);
        //�ֱ��ȡ���ļ�����ʱ�ļ��Ƚ�md5�ж��Ƿ��޸Ĺ�
        FileInputStream oldfileInputStream = new FileInputStream(old);
        FileInputStream tmpfileInputStream = new FileInputStream(tmp);
        String oldFileMD5 = new String(Hex.encodeHex(DigestUtils.md5(oldfileInputStream)));
        String tmpFileMD5 = new String(Hex.encodeHex(DigestUtils.md5(tmpfileInputStream)));
        oldfileInputStream.close();
        tmpfileInputStream.close();
        if (oldFileMD5 == null || tmpFileMD5 == null) {
            return false;
        }
        return (!oldFileMD5.equals(tmpFileMD5));
    }

    // �õ��Ƿ񱣴�
    public static Boolean ifSaved() throws IOException {
        //�ж��Ƿ�Ϊ��
        if (Constants.CURRENTWORKINGFILE != null && Constants.CURRENTWORKINGGRAPH != null) {
            //�ж��Ƿ��޸Ĺ������޸Ĺ������Ի���û�޸���ɾ����ʱ�ļ�
            if (graphChanged(Constants.CURRENTWORKINGFILE, Constants.CURRENTWORKINGGRAPH)) {
                int result = JOptionPane.showConfirmDialog(null, "�Ƿ񱣴浱ǰ������");
                //��ѡ��Ĳ��������ж�
                switch (result) {
                case 0:
                    //ѡ���ǣ���ɾ�����ļ�������ʱ�ļ�������Ϊԭ�����ļ�������
                    old.delete();
                    tmp.renameTo(new File(tmp.getAbsolutePath().replaceAll(".tmp", "")));
                    return true;
                case 1:
                    tmp.delete();
                    return true;
                case 2:
                    return false;
                case -1:
                    return false;
                default:
                    break;
                }
            }
            if(tmp.exists()){
                tmp.delete();
            }
        }
        return true;
    }
    //�������������Ϣ
    public static void editMonitorArea(){
        Constants.MONITORAREA.setText(" workflow is runing.");
        Constants.MONITORAREA.setText(" workflow is runing....");
    }
}
