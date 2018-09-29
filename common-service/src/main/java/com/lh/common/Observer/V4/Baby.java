/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V4;

import com.lh.common.Observer.V3.Father;
import com.lh.common.Observer.V3.Mother;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 003427
 * @version $Id: Baby.java, v 0.1 2018-09-27 9:49 003427 Exp $$
 */
public class Baby implements Runnable{
   private List<WakeUpListener> wakeUpListeners = new ArrayList<>();
   public void addListener(WakeUpListener listener){
       wakeUpListeners.add(listener);
   }

    public void wakeUp(){
        for(WakeUpListener listener : wakeUpListeners){
            listener.actiontoWakeUp(new WakeUpEvent(true, this));
        }
    }

    @Override
    public void run() {
        boolean flag = true;
        while(flag){
            for(int i=0;i<5;i++){
                try {
                    Thread.sleep(1000);
                    System.out.println("宝宝还有"+(5-i)+"秒醒来");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            this.wakeUp();
            flag =false;
        }
    }
}
