/**
 * 
 */
package jsi.nova.gui.component;

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

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxEventSource.mxIEventListener;
import com.mxgraph.view.mxGraph;

import jsi.nova.jgraphx.IfChangedGraph;
import jsi.nova.util.ConstantsRepository;

/**
 * @ClassName:     GraphPopMenu.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��13�� ����9:53:16 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphPopMenu extends JPopupMenu{
    
    private JMenuItem openGraph;
    private JMenuItem saveGraph;
    private JMenuItem runGraph;
    private JMenuItem deleteGraph;
    private GraphTreeNode node;
    public GraphPopMenu(GraphTreeNode node) {
        // TODO Auto-generated constructor stub
        this.node = node;
        openGraph = new JMenuItem("��");
        saveGraph = new JMenuItem("����");
        runGraph = new JMenuItem("����");
        deleteGraph = new JMenuItem("ɾ��");
        //
        openGraph.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try {
                    openGraphFile();
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } 
            }
        });
        
        saveGraph.addActionListener(new ActionListener() {
            
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
        });
        //
        this.add(openGraph);
        this.addSeparator();
        this.add(saveGraph);
        this.addSeparator();
        this.add(runGraph);
        this.addSeparator();
        this.add(deleteGraph);
    }
    public void openGraphFile() throws FileNotFoundException{
        //IfChangedGraph graph = new IfChangedGraph();
        mxGraph graph = new mxGraph();
        File graphFile = new File(node.getGraphFile());
        //ConstantsRepository.OPENDGRAPH.put(graphFile.getAbsolutePath(), graph);
        ConstantsRepository.CURRENTWORKINGFILE = graphFile.getAbsolutePath();
        ConstantsRepository.CURRENTWORKINGGRAPH = graph;
        XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(graphFile)));
        //System.out.println(xmlDecoder.readObject().toString());
        Object[] cells = (Object[]) xmlDecoder.readObject();
        for(Object cell:cells){
            graph.addCell(cell);
        }
        xmlDecoder.close();
        ConstantsRepository.graphComponent.setGridVisible(true);
        ConstantsRepository.graphComponent.setGraph(graph);
        ConstantsRepository.graphComponent.updateUI();
    }
    public void saveGraphFile() throws FileNotFoundException{
        XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(new File(node.getGraphFile()))));
        Object[] cells = ConstantsRepository.graphComponent.getCells(ConstantsRepository.graphComponent.getBounds());
        xmlEncoder.writeObject(cells);
        xmlEncoder.close();
    }
}
