/**
 * 
 */
package jsi.nova.gui.panel;

import javax.swing.JSplitPane;

/**
 * @ClassName:     MainSplitPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:05:08 
 * @Place          �������պ����ѧ�е���������о���
 */
public class MainSplitPanel extends JSplitPane {
    private ProjectTreePanel projectTreePanel = null;
    private GraphAndMonitorSplitPanel graphAndMonitorSplitPanel = null;
    
    public MainSplitPanel() {
        // TODO Auto-generated constructor stub
        projectTreePanel = new ProjectTreePanel();
        graphAndMonitorSplitPanel = new GraphAndMonitorSplitPanel(JSplitPane.VERTICAL_SPLIT);
        
        this.setLeftComponent(projectTreePanel);
        this.setRightComponent(graphAndMonitorSplitPanel);
    }

    public GraphAndMonitorSplitPanel getGraphAndMonitorSplitPanel() {
        return graphAndMonitorSplitPanel;
    }

    public void setGraphAndMonitorSplitPanel(GraphAndMonitorSplitPanel graphAndMonitorSplitPanel) {
        this.graphAndMonitorSplitPanel = graphAndMonitorSplitPanel;
    }
}
