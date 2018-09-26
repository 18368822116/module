/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.abstrac;

import com.lh.common.factory.simple.*;

/**
 * @author 003427
 * @version $Id: IntelFactory.java, v 0.1 2018-09-10 16:22 003427 Exp $$
 */
public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {return new AmdCpu(938);}

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard(938);
    }
}
