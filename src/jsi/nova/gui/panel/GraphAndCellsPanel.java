/**
 * 
 */
package jsi.nova.gui.panel;

import javax.swing.JSplitPane;

/**
 * @ClassName:     GraphAndCellsPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��26�� ����2:04:46 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphAndCellsPanel extends JSplitPane{
    
    private static GraphAndCellsPanel panel = new GraphAndCellsPanel(JSplitPane.HORIZONTAL_SPLIT);
    
    private GraphAndCellsPanel(int newOrientation) {
        // TODO Auto-generated constructor stub
        super(newOrientation);
        //
        this.setLeftComponent(GraphPanel.getPanel());
        this.setRightComponent(CellsPanel.getPanel());
    }

    public static GraphAndCellsPanel getPanel() {
        return panel;
    }
}
