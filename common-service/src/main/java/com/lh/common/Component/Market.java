/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Component;

/**
 * @author 003427
 * @version $Id: Market.java, v 0.1 2018-09-13 15:17 003427 Exp $$
 * 组合模式
 */
public abstract class Market {
    protected String name;
    public abstract void add(Market market);
    public abstract void remove(Market market);
    public abstract void payByCard();
}
