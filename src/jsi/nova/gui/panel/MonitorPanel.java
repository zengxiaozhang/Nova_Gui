/**
 * 
 */
package jsi.nova.gui.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import jsi.nova.util.Constants;

/**
 * @ClassName:     MonitorPanel.java
 * @Description:   nothing
 * @version        V1.0  
 * @Date           2017��12��4�� ����2:57:36 
 * @Place          �������պ����ѧ�е���������о���
 */
public class MonitorPanel extends JPanel{
    private JTextArea monitor_area;
    public MonitorPanel() {
        // TODO Auto-generated constructor stub
        Constants.MONITORAREA = new JTextArea();
        Constants.MONITORAREA.setEditable(false);
        this.setLayout(new GridLayout(1, 1));
        this.add(Constants.MONITORAREA);
    }
}
