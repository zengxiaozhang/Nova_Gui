/**
 * 
 */
package jsi.nova.jgraphx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mxgraph.model.mxCell;

import jsi.nova.util.Constants;

/**
 * @ClassName:     CellPopMenuActions.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��27�� ����12:51:10 
 * @Place          �������պ����ѧ�е���������о���
 */
public class CellPopMenuActions {
    public static class EditCellListener implements ActionListener {
        private mxCell cell;

        public EditCellListener(mxCell cell) {
            // TODO Auto-generated constructor stub
            this.cell = cell;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            editCell(cell);
        }

    }

    public static class RemoveCellListener implements ActionListener {
        private mxCell cell;

        public RemoveCellListener(mxCell cell) {
            // TODO Auto-generated constructor stub
            this.cell = cell;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            removeCell(cell);
        }

    }

    public static void editCell(mxCell cell) {
        if (cell instanceof CommandsCell) {
            new EditCommandsCellDialog((CommandsCell) cell);
        }
        if (cell instanceof InnerGraphCell) {
            new EditInnerCellDialog((InnerGraphCell) cell);
        } else if (cell.isEdge()) {

        }

    }

    public static void removeCell(mxCell cell) {
        Object[] cells = { cell };
        Constants.graphComponent.getGraph().removeCells(cells);
    }

}
