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

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import com.mxgraph.view.mxGraph;

import jsi.nova.util.Constants;

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
        openGraph.addActionListener(new GraphPopMenuActions.openGraphListener(node));     
        saveGraph.addActionListener(new GraphPopMenuActions.saveGraphListener(node));
        //
        this.add(openGraph);
        this.addSeparator();
        this.add(saveGraph);
        this.addSeparator();
        this.add(runGraph);
        this.addSeparator();
        this.add(deleteGraph);
    }
}
