/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.simple;

/**
 * @author 003427
 * @version $Id: IntelMainBoard.java, v 0.1 2018-09-10 11:27 003427 Exp $$
 */
public class IntelMainBoard implements MainBoard{
    private int cpuHoles = 0;

    public IntelMainBoard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("intel 主板的cpu插槽孔数是：" + cpuHoles);
    }
}
