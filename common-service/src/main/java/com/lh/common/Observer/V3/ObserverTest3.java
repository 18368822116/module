/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V3;

import com.lh.common.Observer.V3.Baby;
import com.lh.common.Observer.V3.Mother;

/**
 * @author 003427
 * @version $Id: ObserverTest1.java, v 0.1 2018-09-27 9:57 003427 Exp $$
 */
public class ObserverTest3 {
    public static void main(String[] args) {
        Baby baby = new Baby(new Mother(), new Father());
        new Thread(baby).start();
    }
}
