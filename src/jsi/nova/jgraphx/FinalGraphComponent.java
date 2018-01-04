/**
 * 
 */
package jsi.nova.jgraphx;

import org.w3c.dom.Document;

import com.mxgraph.io.mxCodec;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxGraph;

/**
 * @ClassName:     FinalGraphComponent.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
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
//        mxCodec codec = new mxCodec();
//        Document doc = mxUtils.loadDocument(FinalGraphComponent.class.getResource("/resources/default-style.xml").toString());
//        codec.decode(doc.getDocumentElement(), this.getGraph().getStylesheet());
        
        this.getGraphControl().addMouseListener(new LeftMouseButtonListener());
        this.setVisible(false);
        this.setGridVisible(true);
    }

    public static FinalGraphComponent getGraphComponent() {
        return graphComponent;
    }
}
