/**
 * 
 */
package jsi.nova.gui.frame;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import jsi.nova.gui.panel.GraphAndCellsPanel;
import jsi.nova.gui.panel.GraphAndMonitorSplitPanel;
import jsi.nova.gui.panel.MainSplitPanel;

/**
 * @ClassName:     FrameResizeListener.java
 * @Description:   当Frame大小发生改变时的响应事件 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年12月28日 下午4:43:33 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class FrameResizeListener implements ComponentListener{

    /* (non-Javadoc)
     * @see java.awt.event.ComponentListener#componentResized(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentResized(ComponentEvent e) {
        // TODO Auto-generated method stub
        MainSplitPanel.getSplitPanel().setDividerLocation(0.11);
        GraphAndMonitorSplitPanel.getSplitPanel().setDividerLocation(0.8);
        GraphAndCellsPanel.getPanel().setDividerLocation(0.85);
        MainFrame.getMainFrame().validate(); 
    }

    /* (non-Javadoc)
     * @see java.awt.event.ComponentListener#componentMoved(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentMoved(ComponentEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.ComponentListener#componentShown(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentShown(ComponentEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.ComponentListener#componentHidden(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentHidden(ComponentEvent e) {
        // TODO Auto-generated method stub
        
    }


}
