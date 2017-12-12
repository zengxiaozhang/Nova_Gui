/**
 * 
 */
package jsi.nova.gui.component;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @ClassName:     ProjectPopMenu.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��8�� ����3:24:11 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ProjectPopMenu extends JPopupMenu{
    
    private JMenuItem newGraph = null;
    private JMenuItem deleteProject = null;
    
    public ProjectPopMenu(DefaultMutableTreeNode dn) {
        // TODO Auto-generated constructor stub
        newGraph = new JMenuItem("�½�����ͼ");
        deleteProject = new JMenuItem("ɾ����Ŀ");
        //
        String path = ((ProjectTreeNode)dn).getProjectPath();
        
        this.add(newGraph);
        this.addSeparator();
        this.add(deleteProject);
    }

}
