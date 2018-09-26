/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Component;

/**
 * @author 003427
 * @version $Id: Client.java, v 0.1 2018-09-13 15:29 003427 Exp $$
 */
public class Client {
    public static void main(String[] args) {
        MarketBranch rootBranch = new MarketBranch("总店");
        MarketBranch branch1 = new MarketBranch("一号店");
        MarketJoin join_1 = new MarketJoin("一号店分店1");
        MarketJoin join_2 = new MarketJoin("一号店分店2");

        branch1.add(join_1);
        branch1.add(join_2);
        rootBranch.add(branch1);
        rootBranch.payByCard();
    }
}
