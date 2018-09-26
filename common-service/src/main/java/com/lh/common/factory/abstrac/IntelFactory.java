/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.abstrac;

import com.lh.common.factory.simple.Cpu;
import com.lh.common.factory.simple.IntelCpu;
import com.lh.common.factory.simple.IntelMainBoard;
import com.lh.common.factory.simple.MainBoard;

/**
 * @author 003427
 * @version $Id: IntelFactory.java, v 0.1 2018-09-10 16:22 003427 Exp $$
 */
public class IntelFactory implements AbstractFactory{

    @Override
    public Cpu createCpu() {return new IntelCpu(755);}

    @Override
    public MainBoard createMainBoard() {return new IntelMainBoard(755);}
}
