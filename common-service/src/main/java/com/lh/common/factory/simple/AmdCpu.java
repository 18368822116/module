/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.simple;

/**
 * @author 003427
 * @version $Id: AmdCpu.java, v 0.1 2018-09-10 11:23 003427 Exp $$
 */
public class AmdCpu implements Cpu{
    private int pins = 0;

    public AmdCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("amd cup 针脚数：" + pins);
    }
}
