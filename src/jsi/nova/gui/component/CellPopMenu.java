/**
 * 
 */
package jsi.nova.gui.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import jsi.nova.gui.dialog.EditCommandsCellDialog;
import jsi.nova.jgraphx.CommandsCell;

/**
 * @ClassName:     CellPopMenu.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��11��22�� ����3:34:18 
 * @Place          �������պ����ѧ�е���������о���
 */
public class CellPopMenu extends JPopupMenu {
    JMenuItem edit;
    JMenuItem delete;

    public CellPopMenu(CommandsCell cell) {
        // TODO Auto-generated constructor stub
        edit = new JMenuItem("�༭");
        delete = new JMenuItem("ɾ��");
        edit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (cell instanceof CommandsCell) {
                    new EditCommandsCellDialog(cell);
                }
                else if(cell.isEdge()){
                   
                }
            }
        });
        delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            }
        });
        this.add(edit);
        this.add(delete);
    }
}
