/**
 * 
 */
package jsi.nova.jgraphx;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;

/**
 * @ClassName:     ComandsCell.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��6�� ����12:51:56 
 * @Place          �������պ����ѧ�е���������о���
 */
public class CommandsCell extends mxCell {
    private String commands = null;

    public CommandsCell() {
        super();
        // TODO Auto-generated constructor stub
    }

    public CommandsCell(Object arg0, mxGeometry arg1, String arg2) {
        super(arg0, arg1, arg2);
        // TODO Auto-generated constructor stub
    }
    
    public CommandsCell(Object arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

}
