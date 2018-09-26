/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Adapter;

/**
 * @author 003427
 * @version $Id: Adapter.java, v 0.1 2018-09-13 11:28 003427 Exp $$
 * 适配器模式
 */
public class Adapter{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void sampleOpertaionA() {
        this.adaptee.sampleOperatoinA();
    }

    public void sampleOpertaionB() {
        //Adapter自己实现
    }
}
