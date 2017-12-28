/**
 * 
 */
package jsi.nova.gui.projecttree;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 * @ClassName:     GraphPopMenu.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         GraphPopMenu
 * @version        V1.0  
 * @Date           2017��12��13�� ����9:53:16 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphPopMenu extends JPopupMenu{
    
    private JMenuItem openGraph;
    private JMenuItem saveGraph;
    private JMenuItem runGraph;
    private JMenuItem deleteGraph;
    private GraphTreeNode node;
    public GraphPopMenu(GraphTreeNode node) {
        // TODO Auto-generated constructor stub
        this.node = node;
        openGraph = new JMenuItem("��");
        saveGraph = new JMenuItem("����");
        runGraph = new JMenuItem("����");
        deleteGraph = new JMenuItem("ɾ��");
        //
        openGraph.addActionListener(new GraphPopMenuActions.OpenGraphListener(node));     
        saveGraph.addActionListener(new GraphPopMenuActions.SaveGraphListener(node));
        runGraph.addActionListener(new GraphPopMenuActions.RunGraphListener(node));
        //
        this.add(openGraph);
        this.addSeparator();
//        this.add(saveGraph);
//        this.addSeparator();
        this.add(runGraph);
        this.addSeparator();
        this.add(deleteGraph);
    }
}
