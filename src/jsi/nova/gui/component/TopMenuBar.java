/**
 * 
 */
package jsi.nova.gui.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import jsi.nova.gui.dialog.NewprojectDialog;

/**
 * @ClassName:     TopMenuBar.java
 * @Description:   the Main Menu
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:34:32 
 * @Place          �������պ����ѧ�е���������о���
 */
public class TopMenuBar extends JMenuBar{
    private JMenu file = null;
    private JMenu run = null;
    private JMenu help = null;
    public TopMenuBar() {
        // TODO Auto-generated constructor stub
        file = new JMenu("�ļ�");
        JMenuItem newproject = new JMenuItem("�½�");
        newproject.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                new NewprojectDialog();
            }
        });
        file.add(newproject);
        file.add(new JMenuItem("���Ϊ"));
        //
        run = new JMenu("����");
        //
        help = new JMenu("����");
        //
        this.add(file);
        this.add(run);
        this.add(help);
    }
}
