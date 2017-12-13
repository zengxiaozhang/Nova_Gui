/**
 * 
 */
package jsi.nova.gui.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import jsi.nova.gui.component.NovaToolBar;
import jsi.nova.gui.component.TopMenuBar;
import jsi.nova.gui.panel.MainSplitPanel;
import jsi.nova.util.ConstantsRepository;

/**
 * @ClassName:     MainFrame.java
 * @Description:   MainFrame
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����2:50:13 
 * @Place          �������պ����ѧ�е���������о���
 */
public class MainFrame extends JFrame{
    private MainSplitPanel mainSplitPanel = null;
    public MainFrame() {
        // TODO Auto-generated constructor stub
        mainSplitPanel = new MainSplitPanel();
        //
        ConstantsRepository.mainFrame = this;
        this.setTitle("NOVA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(new NovaToolBar(), BorderLayout.NORTH);
        this.add(mainSplitPanel, BorderLayout.CENTER);
        this.setJMenuBar(new TopMenuBar());
        
        this.addWindowListener(new FrameWindowListener());
        this.setResizable(true);
        this.setSize(1000,620);
        this.setVisible(true);
        mainSplitPanel.setDividerLocation(0.12);
        mainSplitPanel.getGraphAndMonitorSplitPanel().setDividerLocation(0.8);
        this.setLocationRelativeTo(null);
    }
    public MainSplitPanel getMainSplitPanel() {
        return mainSplitPanel;
    }
    public void setMainSplitPanel(MainSplitPanel mainSplitPanel) {
        this.mainSplitPanel = mainSplitPanel;
    }
}
