/**
 * 
 */
package jsi.nova.gui.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @ClassName:     GraphPanel.java
 * @Description:   TODO(用一句话描述该文件做什么) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年12月4日 下午3:09:20 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class GraphPanel extends JPanel{
    
    public GraphPanel() {
        // TODO Auto-generated constructor stub
        this.setLayout(new GridLayout(1, 1));
        this.add(new JTextArea());
    }
}
