/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Bridge;

/**
 * @author 003427
 * @version $Id: DB2BridgeSourceImpl.java, v 0.1 2018-09-13 14:02 003427 Exp $$
 */
public class MysqlBridgeSourceImpl implements BridgeSource{
    @Override
    public void insert(Object o) {
        System.out.println("mysql insert");
    }

    @Override
    public void delete(Object o) {
        System.out.println("mysql delete");
    }

    @Override
    public void update(Object o) {
        System.out.println("mysql update");
    }

    @Override
    public void select(Object o) {
        System.out.println("mysql select");
    }
}
