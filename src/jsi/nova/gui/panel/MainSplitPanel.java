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
 * @Date           2017年12月4日 下午3:05:08 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class MainSplitPanel extends JSplitPane {
    
    public MainSplitPanel() {
        // TODO Auto-generated constructor stub
        Constants.projectTreePanel = new ProjectTreePanel();
        Constants.graphAndMonitorSplitPanel = new GraphAndMonitorSplitPanel(JSplitPane.VERTICAL_SPLIT);
        
        this.setLeftComponent(Constants.projectTreePanel);
        this.setRightComponent(Constants.graphAndMonitorSplitPanel);
    }
}
