/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Decorator;

/**
 * @author 003427
 * @version $Id: Cliend.java, v 0.1 2018-09-13 16:44 003427 Exp $$
 */
public class Cliend {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        TheGreatestSage fish = new Fish(sage);
        TheGreatestSage bird = new Bird(fish);
        bird.move();
    }
}
