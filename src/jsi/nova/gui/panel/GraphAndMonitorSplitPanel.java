/**
 * 
 */
package jsi.nova.gui.panel;

import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

/**
 * @ClassName:     GraphAndMonitorSplitPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:07:50 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphAndMonitorSplitPanel extends JSplitPane{
    private GraphPanel graphPanel = null;
    private MonitorPanel monitorPanel = null;
    public GraphAndMonitorSplitPanel(int newOrientation) {
        // TODO Auto-generated constructor stub
        super(newOrientation);
        graphPanel = new GraphPanel();
        monitorPanel = new MonitorPanel();
        //
        this.setLeftComponent(graphPanel);
        this.setRightComponent(monitorPanel);
    }

}
