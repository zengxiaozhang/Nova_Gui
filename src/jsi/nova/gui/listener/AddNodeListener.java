///**
// * 
// */
//package jsi.nova.gui.listener;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import com.mxgraph.model.mxGeometry;
//import com.mxgraph.swing.mxGraphComponent;
//import com.mxgraph.view.mxGraph;
//
//import jsi.nova.jgraphx.CommandsCell;
//import jsi.nova.util.Constants;
//
///**
// * @ClassName:     AddNodeListener.java
// * @Description:   Add cell
// * @author         zhangzengxiao
// * @version        V1.0  
// * @Date           2017年12月4日 下午5:10:58 
// * @Place          北京航空航天大学中德软件联合研究所
// */
//public class AddNodeListener implements ActionListener{
//    private mxGraph graph = null;
//    final int PORT_DIAMETER = 20;
//    final int PORT_RADIUS = PORT_DIAMETER / 2;
//    private int cellsCount = 1;
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        // TODO Auto-generated method stub
//        addNode();
//    }
//    public void addNode(){      
//        mxGraphComponent mg = new Constants().graphComponent;
//        graph = mg.getGraph();
//        String value = "phase"+cellsCount++;
//        // Sets the default edge style
////        Map<String, Object> style = graph.getStylesheet().getDefaultEdgeStyle();
////        style.put(mxConstants.STYLE_EDGE, mxEdgeStyle.ElbowConnector);
//        //
//        mxGeometry cellgeometry = new mxGeometry(0,0,80,50);
//        cellgeometry.setRelative(false);
//        CommandsCell cell = new CommandsCell(value, cellgeometry, "");
//        //mxCell cell = new mxCell("Hello", cellgeometry, "");
//        cell.setId(null);
//        cell.setVertex(true);
//        cell.setConnectable(true);
//        graph.addCell(cell, graph.getDefaultParent());
//        
//        
////        graph.insertVertex(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
////        graph.insertVertex(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
////        graph.insertVertex(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
////        mxCell cell = (mxCell) graph.insertVertex(graph.getDefaultParent(), null, "Hello", 20,
////                20, 100, 100, "");
////        mxGeometry geo = graph.getModel().getGeometry(cell);
////        // The size of the rectangle when the minus sign is clicked
////        geo.setAlternateBounds(new mxRectangle(20, 20, 100, 50));
////
////        mxGeometry geo1 = new mxGeometry(0, 0.5, PORT_DIAMETER, PORT_DIAMETER);
////        // Because the origin is at upper left corner, need to translate to
////        // position the center of port correctly
////        geo1.setOffset(new mxPoint(-PORT_RADIUS, -PORT_RADIUS));
////        geo1.setRelative(true);
////
////        mxCell port1 = new mxCell(null, geo1,"shape=ellipse;perimter=ellipsePerimeter");
////        port1.setValue(cell.getValue());
////        port1.setVertex(true);
////
////        mxGeometry geo2 = new mxGeometry(1.0, 0.5, PORT_DIAMETER,PORT_DIAMETER);
////        geo2.setOffset(new mxPoint(-PORT_RADIUS, -PORT_RADIUS));
////        geo2.setRelative(true);
////
////        mxCell port2 = new mxCell(null, geo2,"shape=ellipse;perimter=ellipsePerimeter");
////        port2.setValue(cell.getValue());
////        port2.setVertex(true);
//        
//        //graph.addCell(port1, cell);
//        //graph.addCell(port2, cell);
//        
//    }
//
//}
