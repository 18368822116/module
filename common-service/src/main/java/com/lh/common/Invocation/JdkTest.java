/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Invocation;

import java.lang.reflect.Proxy;

/**
 * @author 003427
 * @version $Id: JdkTest.java, v 0.1 2018-09-26 10:02 003427 Exp $$
 */
public class JdkTest {
    public static void main(String[] args) {
        PersonInvocatoinHandler personInvocatoinHandler = new PersonInvocatoinHandler(new PersonImpl());
        Person personProxy = (Person)Proxy.newProxyInstance(PersonImpl.class.getClassLoader(),PersonImpl.class.getInterfaces(), personInvocatoinHandler);
        personProxy.eat();
    }
}
