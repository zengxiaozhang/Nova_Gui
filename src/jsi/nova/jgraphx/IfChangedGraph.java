/**
 * 
 */
package jsi.nova.jgraphx;

import com.mxgraph.view.mxGraph;

/**
 * @ClassName:     IfChangedGraph.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��13�� ����1:45:16 
 * @Place          �������պ����ѧ�е����������о���
 */
public class IfChangedGraph extends mxGraph implements Cloneable{
    private int hasBeenChanged = 0;

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
}