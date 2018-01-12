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
    
    private static MonitorPanel panel = new MonitorPanel();
    private static JTextArea monitor_area;
    
    private  MonitorPanel() {
        // TODO Auto-generated constructor stub
        monitor_area = new JTextArea();
        monitor_area.setEditable(false);
        this.setLayout(new GridLayout(1, 1));
        this.add(monitor_area);
    }
    public static MonitorPanel getPanel() {
        return panel;
    }
    public static JTextArea getMonitor_area() {
        return monitor_area;
    }
}
