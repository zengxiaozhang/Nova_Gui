/**
 * 
 */
package jsi.nova.gui.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import jsi.nova.util.ConstantsRepository;

/**
 * @ClassName:     GraphPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:09:20 
 * @Place          �������պ����ѧ�е����������о���
 */
public class GraphPanel extends JPanel{
    private mxGraph graph = null;
    public GraphPanel() {
        // TODO Auto-generated constructor stub
        graph = ConstantsRepository.graph;
        this.setLayout(new GridLayout(1, 1));
        this.add(new mxGraphComponent(graph));
    }
}