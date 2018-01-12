/**
 * 
 */
package jsi.nova.gui.ToolBar;

import javax.swing.JButton;
import javax.swing.JToolBar;

import jsi.nova.gui.listener.SaveGraphListener;
import jsi.nova.util.GuiUtil;

/**
 * @ClassName:     NovaToolBar.java
 * @Description:   the main toolbar
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:36:59 
 * @Place          �������պ����ѧ�е���������о���
 */
public class NovaToolBar extends JToolBar {

    private JButton runWorkflow = null;
    private JButton saveGraph = null;
    private JButton openGraph = null;
    private JButton addNode = null;
    private JButton addEdge = null;
    private JButton testButton = null;
    private JButton zoomin = null;
    private JButton zoomout = null;

    public NovaToolBar() {
        // TODO Auto-generated constructor stub
//        runWorkflow = new JButton();
//        GuiUtil.setImageIcon(runWorkflow, "video_play_64.png", "���й�����");
        saveGraph = new JButton();
        GuiUtil.setImageIcon(saveGraph, "save.gif", "���浱ǰ������");
//        openGraph = new JButton();
//        GuiUtil.setImageIcon(openGraph, "outbox_64.png", "��ͼƬ");
//        addNode = new JButton();
//        GuiUtil.setImageIcon(addNode, "frame_64.png", "��ӽڵ�");
//        addEdge = new JButton();
//        GuiUtil.setImageIcon(addEdge, "arrow_64.png", "�������");
        zoomin = new JButton();
        GuiUtil.setImageIcon(zoomin, "zoomin.gif", "�Ŵ�");
        zoomout = new JButton();
        GuiUtil.setImageIcon(zoomout, "zoomout.gif", "��С");
        
        testButton = new JButton("����");
        //
        //runWorkflow.addActionListener(new RunWorkFlowListener());
//        addNode.addActionListener(new AddNodeListener());
        saveGraph.addActionListener(new SaveGraphListener());
//        openGraph.addActionListener(new OpenGraphListener());
        zoomin.addActionListener(new ZoomInListener());
        zoomout.addActionListener(new ZoomOutListener());
        testButton.addActionListener(new TestPrintListener());
        //
//        this.add(runWorkflow);
        this.add(saveGraph);
//        this.add(openGraph);
//        this.add(addNode);
//        this.add(addEdge);
        this.add(zoomin);
        this.add(zoomout);
        this.add(testButton);
        this.setFloatable(false);
    }

}
