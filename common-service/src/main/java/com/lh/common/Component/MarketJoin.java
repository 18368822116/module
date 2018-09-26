/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Component;

/**
 * @author 003427
 * @version $Id: MarketJoin.java, v 0.1 2018-09-13 15:26 003427 Exp $$
 */
public class MarketJoin extends Market{

    public MarketJoin(String name){
        this.name = name;
    }

    @Override
    public void add(Market market) {
        //not to do
    }

    @Override
    public void remove(Market market) {
        //not to do
    }

    @Override
    public void payByCard() {
        System.out.println(name + "消费,积分已累加入该会员卡");
    }
}
