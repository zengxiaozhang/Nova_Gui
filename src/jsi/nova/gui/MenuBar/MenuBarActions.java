/**
 * 
 */
package jsi.nova.gui.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName:     MenuBarActions.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2018��1��3�� ����3:51:29 
 * @Place          �������պ����ѧ�е���������о���
 */
public class MenuBarActions {
    
    public static class NewProjectListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            NewprojectDialog.getNewprojectDialog();
        }
        
    }

}
