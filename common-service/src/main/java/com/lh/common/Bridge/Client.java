/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Bridge;

/**
 * @author 003427
 * @version $Id: Client.java, v 0.1 2018-09-13 14:25 003427 Exp $$
 */
public class Client {
    public static void main(String[] args) {
        Bridge bridge1 = new ProjectBridge(new MysqlBridgeSourceImpl());
        bridge1.insert("");
        bridge1.update("");
        Bridge bridge2 = new ProjectBridge(new DB2BridgeSourceImpl());
        bridge2.insert("");
        bridge2.update("");
    }
}
