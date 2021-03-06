/**
 * 
 */
package jsi.nova.gui.projecttree;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import jsi.nova.gui.panel.ProjectTreePanel;
import jsi.nova.util.Constants;

/**
 * @ClassName:     ProjectTreeMouseListener.java
 * @Description:   监听tree的鼠标事件
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017年12月8日 下午2:45:39 
 * @Place          北京航空航天大学中德软件联合研究所
 */
public class ProjectTreeMouseListener implements MouseListener {

    private static JTree tree = ProjectTreePanel.getProject_tree();

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        DefaultMutableTreeNode dn = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        //右键事件
        if (e.getButton() == 3) {
            if (dn instanceof ProjectTreeNode) {
                new ProjectPopMenu((ProjectTreeNode) dn).show(tree, e.getX(), e.getY());
                ;
            } else if (dn instanceof GraphTreeNode) {
                new GraphPopMenu((GraphTreeNode) dn).show(tree, e.getX(), e.getY());
                ;
            }
        }
        //双击事件
        if (e.getClickCount() == 2 && e.getButton() == 1) {
            if (dn instanceof GraphTreeNode) {
                try {
                    if (GraphPopMenuActions.ifSaved()) {
                        GraphPopMenuActions.openGraphFile((GraphTreeNode) dn);
                    }
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        //ConstantsRepository.projectTree.setSelectionPath(ConstantsRepository.projectTree.getPathForLocation(e.getX(), e.getY()));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
