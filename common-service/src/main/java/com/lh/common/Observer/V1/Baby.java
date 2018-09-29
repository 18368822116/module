/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V1;

/**
 * @author 003427
 * @version $Id: Baby.java, v 0.1 2018-09-27 9:49 003427 Exp $$
 */
public class Baby implements Runnable{
    private boolean wakeup = false;

    public void wakeUp(){
        this.wakeup = true;
    }

    public boolean isWakeup() {
        return wakeup;
    }

    public void setWakeup(boolean wakeup) {
        this.wakeup = wakeup;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wakeUp();
    }
}
