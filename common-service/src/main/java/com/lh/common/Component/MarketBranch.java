/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 003427
 * @version $Id: MarketBranch.java, v 0.1 2018-09-13 15:20 003427 Exp $$
 */
public class MarketBranch extends Market{
    List<Market> list = new ArrayList<Market>();

    public MarketBranch(String name){
        this.name = name;
    }

    @Override
    public void add(Market market) {
        list.add(market);
    }

    @Override
    public void remove(Market market) {
        list.remove(market);
    }

    @Override
    public void payByCard() {
        System.out.println(name + "消费,积分已累加入该会员卡");
        for(Market m : list){
            m.payByCard();
        }
    }
}
