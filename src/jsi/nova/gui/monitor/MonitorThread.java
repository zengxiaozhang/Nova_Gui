/**
 * 
 */
package jsi.nova.gui.monitor;

import javax.swing.JTextArea;

import jsi.nova.gui.panel.MonitorPanel;

/**
 * @ClassName:     MonitorThread.java
 * @Description:   TODO(��һ�仰�������ļ���ʲô) 
 * @author         zhangzengxiao
 * @version        V1.0  
 * @Date           2018��1��11�� ����12:30:01 
 * @Place          �������պ����ѧ�е���������о���
 */
public class MonitorThread implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        JTextArea monitor_show_area = MonitorPanel.getMonitor_area();
        while (true) {
            StringBuilder sb = new StringBuilder("workflow is runing");
            for (int i = 0; i < 10; i++) {
                monitor_show_area.setText(sb.append(".").toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
    }
}
