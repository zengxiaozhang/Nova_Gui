/**
 * 
 */
package jsi.nova.gui.ToolBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import jsi.nova.jgraphx.FinalGraphComponent;
import jsi.nova.util.Constants;

/**
 * @ClassName:     TestPrintListener.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��5�� ����10:31:15 
 * @Place          �������պ����ѧ�е���������о���
 */
public class TestPrintListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        mxGraphComponent mg = FinalGraphComponent.getGraphComponent();
        for(Object cell : mg.getCells(mg.getBounds())){
            System.out.println(cell);
//            if(cell instanceof CommandsCell){
//                //System.out.println(cell);
//            }
//            else{
//                mxCell c = (mxCell) cell;
//                System.out.println(c.getSource());
//                System.out.println(c.getTarget());
//            }
        }
        
    }

}
