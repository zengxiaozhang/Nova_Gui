/**
 * 
 */
package jsi.nova.gui.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @ClassName:     MonitorPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����2:57:36 
 * @Place          �������պ����ѧ�е���������о���
 */
public class MonitorPanel extends JPanel{

    public MonitorPanel() {
        // TODO Auto-generated constructor stub
        this.setLayout(new GridLayout(1, 1));
        this.add(new JTextArea());
    }
}
