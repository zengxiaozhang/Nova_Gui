/**
 * 
 */
package jsi.nova.gui.ToolBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jsi.nova.jgraphx.FinalGraphComponent;
import jsi.nova.util.Constants;

/**
 * @ClassName:     ZoomOutListener.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zoom out the graph
 * @version        V1.0  
 * @Date           2017��12��7�� ����2:50:48 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ZoomOutListener implements ActionListener{

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        FinalGraphComponent.getGraphComponent().zoomOut();
    }

}
