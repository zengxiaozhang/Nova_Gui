/**
 * 
 */
package jsi.nova.util;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import jsi.nova.gui.frame.MainFrame;

/**
 * @ClassName:     ConstantsRepository.java
 * @Description:   ConstantsRepository������ȫ�ֱ���
 * @author         ConstantsRepository
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:53:35 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ConstantsRepository {
    public static mxGraph graph = new mxGraph();
    public static mxGraphComponent graphComponent = new mxGraphComponent(graph);
    public static MainFrame mainFrame =null;

}
