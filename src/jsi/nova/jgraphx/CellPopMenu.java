/**
 * 
 */
package jsi.nova.jgraphx;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import com.mxgraph.model.mxCell;

/**
 * @ClassName:     CellPopMenu.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         this menu poped when a leftbutton clicked
 * @version        V1.0  
 * @Date           2017��11��22�� ����3:34:18 
 * @Place          �������պ����ѧ�е���������о���
 */
public class CellPopMenu extends JPopupMenu {
    JMenuItem edit;
    JMenuItem remove;
    public CellPopMenu(mxCell cell) {
        // TODO Auto-generated constructor stub
        edit = new JMenuItem("�༭");
        remove = new JMenuItem("ɾ��");
        //
        edit.addActionListener(new CellPopMenuActions.EditCellListener(cell));
        remove.addActionListener(new CellPopMenuActions.RemoveCellListener(cell));
        //
        this.add(edit);
        this.add(remove);
    }
}
