/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Thread;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @author 003427
 * @version $Id: Pusher.java, v 0.1 2018-09-20 15:05 003427 Exp $$
 */
public class Puller implements Runnable{

    private Tmail tmail;
    private String name;

    public Puller(Tmail tmail, String name){
        this.tmail = tmail;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.tmail.pull();
            System.out.println("消费者线程【"+name+"】" + "正在消费");
        }
    }
}
