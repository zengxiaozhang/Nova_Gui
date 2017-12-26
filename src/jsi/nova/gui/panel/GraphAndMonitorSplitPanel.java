/**
 * 
 */
package jsi.nova.gui.panel;

import javax.swing.JSplitPane;

import jsi.nova.util.Constants;

/**
 * @ClassName:     GraphAndMonitorSplitPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         contain graph panel and monitor panel
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:07:50 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphAndMonitorSplitPanel extends JSplitPane{

    private MonitorPanel monitorPanel;
    
    public GraphAndMonitorSplitPanel(int newOrientation) {
        // TODO Auto-generated constructor stub
        super(newOrientation);
        Constants.graphAndCellsPanel = new GraphAndCellsPanel(JSplitPane.HORIZONTAL_SPLIT);
        monitorPanel = new MonitorPanel();
        //
        this.setLeftComponent(Constants.graphAndCellsPanel);
        this.setRightComponent(monitorPanel);
    }

}
