/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.simple;

/**
 * @author 003427
 * @version $Id: IntelCpu.java, v 0.1 2018-09-10 11:21 003427 Exp $$
 */
public class IntelCpu  implements Cpu{
    private int pins = 0;

    public IntelCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("intel cpu 针脚数 : " + pins);
    }
}
