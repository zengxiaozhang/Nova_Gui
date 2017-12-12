/**
 * 
 */
package jsi.nova.gui.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import jsi.nova.gui.component.ProjectPopMenu;
import jsi.nova.gui.component.ProjectTreeNode;
import jsi.nova.util.ConstantsRepository;

/**
 * @ClassName:     ProjectTreeMouseListener.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��8�� ����2:45:39 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ProjectTreeMouseListener implements MouseListener{

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getButton()==3){
//            TreePath dtn  = ConstantsRepository.projectTree.getPathForLocation(e.getX(),e.getY());
            DefaultMutableTreeNode dn = (DefaultMutableTreeNode) ConstantsRepository.projectTree.getLastSelectedPathComponent();
            if(dn instanceof ProjectTreeNode){
                new ProjectPopMenu(dn).show(ConstantsRepository.projectTree, e.getX(), e.getY());;
            }
        }
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}