/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 003427
 * @version $Id: PersonInvocatoinHandler.java, v 0.1 2018-09-26 9:53 003427 Exp $$
 */
public class PersonInvocatoinHandler implements InvocationHandler {

    private Object obj;

    public PersonInvocatoinHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("before time to eat");
        method.invoke(obj, args);
        System.out.println("after time to eat");
        return null;
    }

}
