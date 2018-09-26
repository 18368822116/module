/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Decorator;

/**
 * @author 003427
 * @version $Id: Change.java, v 0.1 2018-09-13 16:35 003427 Exp $$
 */
public class Change implements TheGreatestSage{
    private TheGreatestSage theGreatestSage;

    public Change(TheGreatestSage theGreatestSage){
        this.theGreatestSage = theGreatestSage;
    }

    @Override
    public void move() {
        theGreatestSage.move();
    }
}
