/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Decorator;

/**
 * @author 003427
 * @version $Id: Fish.java, v 0.1 2018-09-13 16:38 003427 Exp $$
 */
public class Fish extends  Change{
    public Fish(TheGreatestSage theGreatestSage) {
        super(theGreatestSage);
    }

    @Override
    public void move() {
        System.out.println("Fish Move");
    }

}
