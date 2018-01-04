/**
 * 
 */
package jsi.nova.gui.MenuBar;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 * @ClassName:     TopMenuBar.java
 * @Description:   the Main Menu
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:34:32 
 * @Place          �������պ����ѧ�е���������о���
 */
public class TopMenuBar extends JMenuBar{
    private JMenu file;
    private JMenu help;  
    public TopMenuBar() {
        // TODO Auto-generated constructor stub
        file = new JMenu("�ļ�");
        JMenuItem newproject = new JMenuItem("�½���Ŀ");
        file.add(newproject);
        newproject.addActionListener(new MenuBarActions.NewProjectListener());
        //
        help = new JMenu("����");
        //
        this.add(file);
        this.add(help);
    }
}
