/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V3;

/**
 * @author 003427
 * @version $Id: Mother.java, v 0.1 2018-09-27 9:53 003427 Exp $$
 */
public class Father {
    public void play(WakeUpEvent wakeUpEvent){
        if(!wakeUpEvent.isIfFoodTime()){
            System.out.println("抱宝贝出去玩");
        }
    }
}
