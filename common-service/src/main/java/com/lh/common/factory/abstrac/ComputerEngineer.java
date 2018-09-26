/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.abstrac;

/**
 * @author 003427
 * @version $Id: ComputerEngineer.java, v 0.1 2018-09-10 16:59 003427 Exp $$
 */
public class ComputerEngineer {
    public static void main(String[] agrs){
        AbstractFactory abstractFactory = new AmdFactory();
        abstractFactory.createCpu().calculate();
        abstractFactory.createMainBoard().installCpu();
    }
}
