/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Decorator;

/**
 * @author 003427
 * @version $Id: Bird.java, v 0.1 2018-09-13 16:41 003427 Exp $$
 */
public class Bird extends Change{
    public Bird(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        System.out.println("Bird Move");
    }
}
