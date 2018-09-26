/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Bulider;

/**
 * @author 003427
 * @version $Id: Director.java, v 0.1 2018-09-11 9:13 003427 Exp $$
 */
public class Director {
    Builder builder;

    Director(Builder builder){
        this.builder = builder;
    }

    public void construct(String to, String from){
        builder.buildFrom(from);
        builder.buildTo(to);
        builder.buildSendDate();
        builder.bulidSubject();
        builder.bulidBody();
        builder.sendMessage();
    }
}
