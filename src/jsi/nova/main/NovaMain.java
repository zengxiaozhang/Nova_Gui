/**
 * 
 */
package jsi.nova.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import jsi.nova.gui.frame.MainFrame;

/**
 * @ClassName:     NovaMain.java
 * @Description:   Entrance of this app
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2017��12��4�� ����2:47:15 
 * @Place          �������պ����ѧ�е���������о���
 */
public class NovaMain {
    public static void main(String[] args) {
        // set the theme style
        try {
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //
        MainFrame.getMainFrame();
    }
}
