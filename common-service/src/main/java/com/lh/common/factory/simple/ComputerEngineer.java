/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.simple;

/**
 * @author 003427
 * @version $Id: ComputerEngineer.java, v 0.1 2018-09-10 11:38 003427 Exp $$
 */
public class ComputerEngineer {
    public static void main(String[] agrs){
        Cpu cpu = CpuFactory.createCpu(1);
        MainBoard mainBoard = MainBoardFactory.createMainBoard(2);
        cpu.calculate();
        mainBoard.installCpu();
    }
}
