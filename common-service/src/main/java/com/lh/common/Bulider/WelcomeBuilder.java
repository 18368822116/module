/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Bulider;

/**
 * @author 003427
 * @version $Id: WelcomeBuilder.java, v 0.1 2018-09-10 19:22 003427 Exp $$
 */
public class WelcomeBuilder extends Builder{

    public WelcomeBuilder(){
        autoMessage = new WelcomMessage();
    }

    @Override
    public void bulidSubject() {
        autoMessage.setSubject("欢迎标题");
    }

    @Override
    public void bulidBody() {
        autoMessage.setBody("欢迎内容");
    }
}
