/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V3;

import com.lh.common.Observer.V1.Baby;

/**
 * @author 003427
 * @version $Id: Mother.java, v 0.1 2018-09-27 9:53 003427 Exp $$
 */
public class Mother{
    public void feed(WakeUpEvent wakeUpEvent){
        if(wakeUpEvent.isIfFoodTime()){
            System.out.println("给宝贝喂食");
        }
    }
}
