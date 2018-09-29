/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V1;

/**
 * @author 003427
 * @version $Id: Mother.java, v 0.1 2018-09-27 9:53 003427 Exp $$
 */
public class Mother implements Runnable{

    private Baby baby;

    public Mother(Baby baby){
        this.baby = baby;
    }

    public void feed(){
        System.out.println("已经给宝贝喂食");
    }

    @Override
    public void run() {
        while (!baby.isWakeup()){
            for(int i = 0; i< 5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("宝宝还有"+(5-i)+"秒醒来");
            }

        }
        this.feed();
    }
}
