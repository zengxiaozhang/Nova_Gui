/**
 * 
 */
package jsi.nova.gui.projecttree;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @ClassName:     GraphTreeNode.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��12�� ����9:58:10 
 * @Place          �������պ����ѧ�е���������о���
 */
public class GraphTreeNode extends DefaultMutableTreeNode{

    /**
     * 
     */
    private String graphName;
    private String graphFile;
    
    public GraphTreeNode() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param userObject
     * @param allowsChildren
     */
    public GraphTreeNode(Object userObject, boolean allowsChildren) {
        super(userObject, allowsChildren);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param userObject
     */
    public GraphTreeNode(Object userObject) {
        super(userObject);
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the graphName
     */
    public String getGraphName() {
        return graphName;
    }

    /**
     * @param graphName the graphName to set
     */
    public void setGraphName(String graphName) {
        this.graphName = graphName;
    }

    public String getGraphFile() {
        return graphFile;
    }

    public void setGraphFile(String graphFile) {
        this.graphFile = graphFile;
    }

}
