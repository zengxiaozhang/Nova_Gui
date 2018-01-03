/**
 * 
 */
package jsi.nova.gui.panel;

import javax.swing.JSplitPane;

import jsi.nova.util.Constants;

/**
 * @ClassName:     MainSplitPanel.java
 * @Description:   this panel contain all of other panel
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:05:08 
 * @Place          �������պ����ѧ�е���������о���
 */
public class MainSplitPanel extends JSplitPane {
    private static MainSplitPanel splitPanel = new MainSplitPanel();
    private MainSplitPanel() {
        // TODO Auto-generated constructor stub
        
        this.setLeftComponent(ProjectTreePanel.getPanel());
        this.setRightComponent(GraphAndMonitorSplitPanel.getSplitPanel());
    }

    public static MainSplitPanel getSplitPanel() {
        return splitPanel;
    }
}
