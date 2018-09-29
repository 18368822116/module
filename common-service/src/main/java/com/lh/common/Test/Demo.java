/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Test;

/**
 * @author 003427
 * @version $Id: Demo.java, v 0.1 2018-09-28 17:14 003427 Exp $$
 */
public class Demo {
    public final int value = 4;
    public void doit(){
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println(value);
            }
        };
        r.run();
    }
    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        demo.doit();
        //Thread.sleep(1000);
    }
}
