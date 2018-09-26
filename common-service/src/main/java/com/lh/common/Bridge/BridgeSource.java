/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Bridge;

/**
 * @author 003427
 * @version $Id: BridgeSource.java, v 0.1 2018-09-13 13:59 003427 Exp $$
 */
public interface BridgeSource<T>{
    void insert(T t);
    void delete(T t);
    void update(T t);
    void select(T t);
}
