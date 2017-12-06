/**
 * 
 */
package jsi.nova.gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.view.mxCellEditor;
import com.mxgraph.util.mxDomUtils;
import com.mxgraph.view.mxGraph;

import jsi.nova.jgraphx.CommandsCell;
import jsi.nova.util.ConstantsRepository;

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
        mxGraph graph = ConstantsRepository.graph;
        mxGraphComponent mg = ConstantsRepository.graphComponent;
        for(Object cell : mg.getCells(mg.getBounds())){
           System.out.println(cell instanceof CommandsCell);
        }
        
    }

}
