/**
 * 
 */
package jsi.nova.gui.panel;

import javax.swing.JSplitPane;

/**
 * @ClassName:     GraphAndMonitorSplitPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         contain graph panel and monitor panel
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:07:50 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphAndMonitorSplitPanel extends JSplitPane{
    private static GraphAndMonitorSplitPanel splitPanel = new GraphAndMonitorSplitPanel(JSplitPane.VERTICAL_SPLIT);
    
    private GraphAndMonitorSplitPanel(int newOrientation) {
        // TODO Auto-generated constructor stub
        super(newOrientation);
        //
        this.setLeftComponent(GraphAndCellsPanel.getPanel());
        this.setRightComponent(MonitorPanel.getPanel());
    }

    public static GraphAndMonitorSplitPanel getSplitPanel() {
        return splitPanel;
    }

}
