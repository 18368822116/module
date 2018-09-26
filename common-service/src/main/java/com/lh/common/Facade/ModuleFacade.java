/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Facade;

/**
 * @author 003427
 * @version $Id: ModuleFacade.java, v 0.1 2018-09-13 15:41 003427 Exp $$
 */
public class ModuleFacade {
    ModuleA moduleA = new ModuleA();
    ModuleB moduleB = new ModuleB();

    public void a1(){
        moduleA.a1();
    }

    public void b1(){
        moduleB.b1();
    }
}
