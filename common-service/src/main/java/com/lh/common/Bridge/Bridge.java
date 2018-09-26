/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Bridge;

/**
 * @author 003427
 * @version $Id: Bridge.java, v 0.1 2018-09-13 14:04 003427 Exp $$
 * 桥接模式
 */
public abstract class Bridge<T> {
    private BridgeSource bridgeSource;

    public Bridge(BridgeSource bridgeSource){
        this.bridgeSource = bridgeSource;
    }

    public void insert(Object o) {
        bridgeSource.insert(o);
    }

    public void delete(Object o) {
        bridgeSource.delete(o);
    }

    public void update(Object o) {
        bridgeSource.update(o);
    }

    public void select(Object o) {
        bridgeSource.select(o);
    }
}
