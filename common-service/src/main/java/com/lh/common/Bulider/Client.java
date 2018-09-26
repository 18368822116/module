/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Bulider;

/**
 * @author 003427
 * @version $Id: Client.java, v 0.1 2018-09-11 9:18 003427 Exp $$
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new GoodbyeBuilder());
        director.construct("123@qq.com","456@qq.com");
    }
}
