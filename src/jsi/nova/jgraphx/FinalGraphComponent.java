/**
 * 
 */
package jsi.nova.jgraphx;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

/**
 * @ClassName:     FinalGraphComponent.java
 * @Description:   GraphComponent 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2018��1��4�� ����1:30:57 
 * @Place          �������պ����ѧ�е���������о���
 */
public class FinalGraphComponent extends mxGraphComponent{
    private static FinalGraphComponent graphComponent = new FinalGraphComponent(new mxGraph());

    private FinalGraphComponent(mxGraph arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
        this.getGraphControl().addMouseListener(new LeftMouseButtonListener());
        this.setVisible(false);
        this.setGridVisible(true);
    }

    public static FinalGraphComponent getGraphComponent() {
        return graphComponent;
    }
}
