/**
 * 
 */
package jsi.nova.gui.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

import com.mxgraph.swing.mxGraphComponent;

import jsi.nova.jgraphx.LeftMouseButtonListener;
import jsi.nova.util.ConstantsRepository;

/**
 * @ClassName:     GraphPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         contain the graph
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:09:20 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphPanel extends JPanel{
    mxGraphComponent mxGraphComponent = ConstantsRepository.graphComponent;
    public GraphPanel() {
        // TODO Auto-generated constructor stub
        this.setLayout(new GridLayout(1, 1));
        mxGraphComponent.getGraphControl().addMouseListener(new LeftMouseButtonListener());
        this.add(mxGraphComponent);
    }
}
