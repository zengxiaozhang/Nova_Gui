/**
 * 
 */
package jsi.nova.gui.projecttree;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @ClassName:     ProjectTreeNode.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��8�� ����1:45:32 
 * @Place          �������պ����ѧ�е���������о���
 */
public class ProjectTreeNode extends DefaultMutableTreeNode{

    /**
     * 
     */
    private String projectPath = null;
    public ProjectTreeNode() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param userObject
     * @param allowsChildren
     */
    public ProjectTreeNode(Object userObject, boolean allowsChildren) {
        super(userObject, allowsChildren);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param userObject
     */
    public ProjectTreeNode(Object userObject) {
        super(userObject);
        // TODO Auto-generated constructor stub
        this.add(new DefaultMutableTreeNode());
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }
    

}
