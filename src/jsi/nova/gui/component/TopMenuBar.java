/**
 * 
 */
package jsi.nova.gui.component;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * @ClassName:     TopMenuBar.java
 * @Description:   the Main Menu
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:34:32 
 * @Place          �������պ����ѧ�е���������о���
 */
public class TopMenuBar extends JMenuBar{

    public TopMenuBar() {
        // TODO Auto-generated constructor stub
        this.add(new JMenu("����"));
        this.add(new JMenu("����"));
        this.add(new JMenu("���� "));
    }
}
