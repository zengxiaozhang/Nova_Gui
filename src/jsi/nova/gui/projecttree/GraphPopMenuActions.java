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

import jsi.nova.util.ConstantsRepository;

/**
 * @ClassName:     GraphPopMenuActions.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��13�� ����8:17:47 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphPopMenuActions {
    private static File tmp;
    private static File old;

    public static class openGraphListener implements ActionListener {
        private GraphTreeNode node;

        public openGraphListener(GraphTreeNode node) {
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

    public static class saveGraphListener implements ActionListener {
        private GraphTreeNode node;

        public saveGraphListener(GraphTreeNode node) {
            // TODO Auto-generated constructor stub
            this.node = node;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            try {
                saveGraphFile(node);
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    public static void openGraphFile(GraphTreeNode node) throws FileNotFoundException {
        //IfChangedGraph graph = new IfChangedGraph();
        mxGraph graph = new mxGraph();
        File graphFile = new File(node.getGraphFile());
        //ConstantsRepository.OPENDGRAPH.put(graphFile.getAbsolutePath(), graph);
        ConstantsRepository.CURRENTWORKINGFILE = graphFile.getAbsolutePath();
        ConstantsRepository.CURRENTWORKINGGRAPH = graph;
        XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(graphFile)));
        //System.out.println(xmlDecoder.readObject().toString());
        Object[] cells = (Object[]) xmlDecoder.readObject();
        for (Object cell : cells) {
            graph.addCell(cell);
        }
        xmlDecoder.close();
        ConstantsRepository.graphComponent.setGridVisible(true);
        ConstantsRepository.graphComponent.setGraph(graph);
        ConstantsRepository.graphComponent.updateUI();
    }

    public static void saveGraphFile(GraphTreeNode node) throws FileNotFoundException {
        XMLEncoder xmlEncoder = new XMLEncoder(
                new BufferedOutputStream(new FileOutputStream(new File(node.getGraphFile()))));
        Object[] cells = ConstantsRepository.graphComponent.getCells(ConstantsRepository.graphComponent.getBounds());
        xmlEncoder.writeObject(cells);
        xmlEncoder.close();
    }

    public static Boolean graphChanged(String path, mxGraph graph) throws IOException {
        tmp = new File(path + ".tmp");
        tmp.createNewFile();
        XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(tmp)));
        Object[] cells = ConstantsRepository.graphComponent.getCells(ConstantsRepository.graphComponent.getBounds());
        xmlEncoder.writeObject(cells);
        xmlEncoder.close();
        old = new File(path);
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

    public static Boolean ifSaved() throws IOException {
        if (ConstantsRepository.CURRENTWORKINGFILE != null && ConstantsRepository.CURRENTWORKINGGRAPH != null) {
            if (graphChanged(ConstantsRepository.CURRENTWORKINGFILE, ConstantsRepository.CURRENTWORKINGGRAPH)) {
                int result = JOptionPane.showConfirmDialog(null, "�Ƿ񱣴浱ǰ������");
                switch (result) {
                case 0:
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
        }
        return true;
    }
}
