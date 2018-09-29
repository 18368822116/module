/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V2;

/**
 * @author 003427
 * @version $Id: Baby.java, v 0.1 2018-09-27 9:49 003427 Exp $$
 */
public class Baby implements Runnable{
    private boolean wakeup = false;
    private Mother mother;
    public Baby(Mother mother){
        this.mother = mother;
    }
    public void wakeUp(){
        this.wakeup = true;
        this.mother.feed();
    }

    public boolean isWakeup() {
        return wakeup;
    }

    public void setWakeup(boolean wakeup) {
        this.wakeup = wakeup;
    }

    public void run() {
        while(!this.isWakeup()){
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
        }
    }
}
