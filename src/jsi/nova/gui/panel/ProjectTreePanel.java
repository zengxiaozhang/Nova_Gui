/**
 * 
 */
package jsi.nova.gui.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * @ClassName:     ProjectTreePanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         show the structures of project
 * @version        V1.0  
 * @Date           2017��12��4�� ����2:53:58 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ProjectTreePanel extends JPanel{
    private static ProjectTreePanel panel = new ProjectTreePanel();
    private ProjectTreePanel() {
        // TODO Auto-generated constructor stub
        this.setLayout(new GridLayout(1, 1));
    }

    public static ProjectTreePanel getPanel() {
        return panel;
    }
}
