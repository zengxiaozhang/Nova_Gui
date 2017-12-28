/**
 * 
 */
package jsi.nova.gui.projecttree;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;

import javax.swing.tree.DefaultMutableTreeNode;

import jsi.nova.util.Constants;

/**
 * @ClassName:     ProjectTreeMouseListener.java
 * @Description:   ����tree������¼�
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��8�� ����2:45:39 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ProjectTreeMouseListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        DefaultMutableTreeNode dn = (DefaultMutableTreeNode) Constants.projectTree.getLastSelectedPathComponent();
        //�Ҽ��¼�
        if(e.getButton()==3){
            if(dn instanceof ProjectTreeNode){
                new ProjectPopMenu((ProjectTreeNode) dn).show(Constants.projectTree, e.getX(), e.getY());;
            }
            else if(dn instanceof GraphTreeNode){
                new GraphPopMenu((GraphTreeNode) dn).show(Constants.projectTree, e.getX(), e.getY());;
            }
        }
        //˫���¼�
//        if(e.getClickCount()==2 && e.getButton()==1){
//            if(dn instanceof GraphTreeNode){
//                try {
//                    GraphPopMenuActions.openGraphFile((GraphTreeNode) dn);
//                } catch (FileNotFoundException e1) {
//                    // TODO Auto-generated catch block
//                    e1.printStackTrace();
//                }
//            }
//        }
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