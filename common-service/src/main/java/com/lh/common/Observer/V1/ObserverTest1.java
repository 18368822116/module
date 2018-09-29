/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V1;

/**
 * @author 003427
 * @version $Id: ObserverTest1.java, v 0.1 2018-09-27 9:57 003427 Exp $$
 */
public class ObserverTest1 {
    public static void main(String[] args) {
        Baby baby = new Baby();
        new Thread(baby).start();
        new Thread(new Mother(baby)).start();
    }
}
