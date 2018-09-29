/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V2;

/**
 * @author 003427
 * @version $Id: ObserverTest1.java, v 0.1 2018-09-27 9:57 003427 Exp $$
 */
public class ObserverTest2 {
    public static void main(String[] args) {
        Baby baby = new Baby(new Mother());
        new Thread(baby).start();
    }
}
