/**
 * 
 */
package jsi.nova.util;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

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
    
    //projectTree
    public static DefaultMutableTreeNode projectTreeTop = new DefaultMutableTreeNode("��Ŀ����");
    public static JTree projectTree = new JTree(projectTreeTop);

}
