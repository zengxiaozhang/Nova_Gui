/**
 * 
 */
package jsi.nova.gui.ToolBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jsi.nova.util.Constants;

/**
 * @ClassName:     ZoomInListener.java
 * @Description:   Zoom in graph
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��7�� ����2:49:06 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ZoomInListener implements ActionListener{

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Constants.graphComponent.zoomIn();
    }

}
