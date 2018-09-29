/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V4;

/**
 * @author 003427
 * @version $Id: ObserverTest1.java, v 0.1 2018-09-27 9:57 003427 Exp $$
 */
public class ObserverTest4 {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.addListener(new Mother());
        baby.addListener(new Father());
        new Thread(baby).start();
    }
}
