/**
 * 
 */
package jsi.nova.gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLEncoder;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.mxgraph.io.mxCodec;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxResources;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.util.png.mxPngEncodeParam;
import com.mxgraph.util.png.mxPngImageEncoder;
import com.mxgraph.view.mxGraph;

import jsi.nova.util.Constants;

/**
 * @ClassName:     SaveGraphListener.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         save the graph as a XML File
 * @version        V1.0  
 * @Date           2017��12��5�� ����10:09:36 
 * @Place          �������պ����ѧ�е���������о���
 */
public class SaveGraphListener implements ActionListener {

    mxGraph graph = Constants.graph;
    mxGraphComponent graphComponent = Constants.graphComponent;

    @Override
    public void actionPerformed(ActionEvent e) {
        save2();
    }

    public void saveGraph() throws IOException {
        // Creates the image for the PNG file
        BufferedImage image = mxCellRenderer.createBufferedImage(graph, null, 1, graphComponent.getBackground(),
                graphComponent.isAntiAlias(), null, graphComponent.getCanvas());
        // Creates the URL-encoded XML data
        mxCodec codec = new mxCodec();
        String xml = URLEncoder.encode(mxXmlUtils.getXml(codec.encode(graph.getModel())), "UTF-8");
        File tf = new File("ttt");
        FileWriter fw = new FileWriter(tf);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(mxXmlUtils.getXml(codec.encode(graph.getModel())));
        bw.close();
        fw.close();
        mxPngEncodeParam param = mxPngEncodeParam.getDefaultEncodeParam(image);
        param.setCompressedText(new String[] { "mxGraphModel", xml });
        //
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showSaveDialog(Constants.mainFrame);
        File filename = jFileChooser.getSelectedFile();
        FileOutputStream outputStream = new FileOutputStream(filename);
        try {
            mxPngImageEncoder encoder = new mxPngImageEncoder(outputStream, param);

            if (image != null) {
                encoder.encode(image);           
            } else {
                JOptionPane.showMessageDialog(graphComponent, mxResources.get("noImageData"));
            }
        } finally {
            outputStream.close();
        }

    }
    public void save2(){
        XMLEncoder xmlEncoder = null;
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.showSaveDialog(Constants.mainFrame);
        File savefile = jFileChooser.getSelectedFile();
        if (savefile == null)
            return;
        try {
            xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(savefile)));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Object[] cells = Constants.graphComponent.getCells(Constants.graphComponent.getBounds());
        xmlEncoder.writeObject(cells);
        xmlEncoder.close();
    }

}
