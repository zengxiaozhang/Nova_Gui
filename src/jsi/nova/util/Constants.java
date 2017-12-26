/**
 * 
 */
package jsi.nova.util;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import jsi.nova.gui.frame.MainFrame;
import jsi.nova.gui.panel.GraphAndCellsPanel;
import jsi.nova.gui.panel.GraphAndMonitorSplitPanel;
import jsi.nova.gui.panel.MainSplitPanel;
import jsi.nova.gui.panel.ProjectTreePanel;

/**
 * @ClassName:     ConstantsRepository.java
 * @Description:   ConstantsRepository������ȫ�ֱ���
 * @author         ConstantsRepository
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:53:35 
 * @Place          �������պ����ѧ�е���������о���
 */
public class Constants {
    
    //split panel
    public static MainSplitPanel mainSplitPanel;
    public static GraphAndMonitorSplitPanel graphAndMonitorSplitPanel;
    public static GraphAndCellsPanel graphAndCellsPanel;
    public static ProjectTreePanel projectTreePanel;
    //
    public static mxGraph graph = new mxGraph();
    public static mxGraphComponent graphComponent = new mxGraphComponent(graph);
    public static MainFrame mainFrame =null;
    
    //projectTree
    public static DefaultMutableTreeNode projectTreeTop = new DefaultMutableTreeNode("��Ŀ����");
    //public static JTree projectTree = new JTree(projectTreeTop);
    public static JTree projectTree = null;
    //
    public static Map<String,mxGraph> OPENDGRAPH = new HashMap<String,mxGraph>();
    public static String CURRENTWORKINGFILE;
    public static mxGraph CURRENTWORKINGGRAPH;
    public static mxGraph OLDGRAPH;
}
