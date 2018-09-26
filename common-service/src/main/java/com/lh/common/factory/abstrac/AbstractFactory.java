/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.abstrac;

import com.lh.common.factory.simple.Cpu;
import com.lh.common.factory.simple.MainBoard;

/**
 * @author 003427
 * @version $Id: AbstractFactory.java, v 0.1 2018-09-10 16:08 003427 Exp $$
 */
public interface AbstractFactory {
    public Cpu createCpu();
    public MainBoard createMainBoard();
}
