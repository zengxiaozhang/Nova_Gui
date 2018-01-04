/**
 * 
 */
package jsi.nova.gui.panel;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.mxgraph.swing.mxGraphComponent;

import jsi.nova.jgraphx.FinalGraphComponent;
import jsi.nova.jgraphx.LeftMouseButtonListener;
import jsi.nova.util.Constants;

/**
 * @ClassName:     GraphPanel.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         contain the graph
 * @version        V1.0  
 * @Date           2017��12��4�� ����3:09:20 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphPanel extends JPanel{
    //private mxGraphComponent mxGraphComponent = Constants.graphComponent;
    private ImageIcon icon;  
    private Image img;
    private static GraphPanel Panel = new GraphPanel();
    
    private GraphPanel() {
        // TODO Auto-generated constructor stub
        this.setLayout(new GridLayout(1, 1));
        icon=new ImageIcon(GraphPanel.class.getResource("/img/background.png"));  
        img=icon.getImage();
        
//        mxGraphComponent.getGraphControl().addMouseListener(new LeftMouseButtonListener());
//        mxGraphComponent.setVisible(false);
        //this.add(mxGraphComponent);
        this.add(FinalGraphComponent.getGraphComponent());
    }
    public void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        //����������Ϊ�˱���ͼƬ���Ը��洰�����е�����С�������Լ����óɹ̶���С  
        g.drawImage(img, 0, 0,this.getWidth(), this.getHeight(), this);  
    }
    public static GraphPanel getPanel() {
        return Panel;
    }
}
