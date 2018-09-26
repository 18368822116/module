/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Flyweight;

/**
 * @author 003427
 * @version $Id: ConcreteFleweight.java, v 0.1 2018-09-13 17:02 003427 Exp $$
 */
public class ConcreteFleweight implements Flyweight{

    private Character status = null;

    public ConcreteFleweight(Character status){
        this.status = status;
    }

    @Override
    public void operation(String state) {
        System.out.println("Intrinsic status = " + this.status);
        System.out.println("Extrinsic State = " + state);
    }
}
