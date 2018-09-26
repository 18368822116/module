/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Thread;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 003427
 * @version $Id: Tmail.java, v 0.1 2018-09-20 15:03 003427 Exp $$
 */
public class Tmail {
    private volatile int count = 0;
    private final int MAX_COUNT = 10;

    public synchronized void push(){
        while (count >= MAX_COUNT){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count ++;
        notifyAll();
    }

    public synchronized void pull(){
        while (count <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count --;
        System.out.println("count : " + count);
        notifyAll();
    }

    public static void main(String[] args) {
        Tmail tmail = new Tmail();
        new Thread(new Pusher(tmail,"pusher-1")).start();
        new Thread(new Pusher(tmail,"pusher-2")).start();
        new Thread(new Pusher(tmail,"pusher-3")).start();
        new Thread(new Pusher(tmail,"pusher-4")).start();
        new Thread(new Pusher(tmail,"pusher-5")).start();

        new Thread(new Puller(tmail,"puller-1")).start();
        new Thread(new Puller(tmail,"puller-2")).start();
        new Thread(new Puller(tmail,"puller-3")).start();
        new Thread(new Puller(tmail,"puller-4")).start();
        new Thread(new Puller(tmail,"puller-5")).start();


    }
}
