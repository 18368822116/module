/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Observer.V4;

import com.lh.common.Observer.V4.Baby;

/**
 * @author 003427
 * @version $Id: WakeUpEvent.java, v 0.1 2018-09-27 10:12 003427 Exp $$
 */
public class WakeUpEvent {
    private boolean ifFoodTime;
    private Baby baby;
    public WakeUpEvent(boolean ifFoodTime, Baby baby){
        this.baby = baby;
        this.ifFoodTime = ifFoodTime;
    }

    public boolean isIfFoodTime() {
        return ifFoodTime;
    }

    public void setIfFoodTime(boolean ifFoodTime) {
        this.ifFoodTime = ifFoodTime;
    }

    public Baby getBaby() {
        return baby;
    }

    public void setBaby(Baby baby) {
        this.baby = baby;
    }
}
