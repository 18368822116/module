/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Bulider;

import java.util.Date;

/**
 * @author 003427
 * @version $Id: Builder.java, v 0.1 2018-09-10 19:15 003427 Exp $$
 * 建造者模式
 */
public abstract class Builder {
    protected AutoMessage autoMessage;

    public abstract void bulidSubject();

    public abstract void bulidBody();

    public void buildTo(String to){
        autoMessage.setTo(to);
    }

    public void buildFrom(String from){
        autoMessage.setFrom(from);
    }

    public void buildSendDate(){
        autoMessage.setSendDate(new Date());
    }

    public void sendMessage(){
        autoMessage.send();
    }


}
