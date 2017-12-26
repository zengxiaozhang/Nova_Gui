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
    private GraphPanel graphPanel;
    private CellsPanel cellsPanel;
    public GraphAndCellsPanel(int newOrientation) {
        // TODO Auto-generated constructor stub
        super(newOrientation);
        graphPanel = new GraphPanel();
        cellsPanel = new CellsPanel();
        //
        this.setLeftComponent(graphPanel);
        this.setRightComponent(cellsPanel);
    }

}
