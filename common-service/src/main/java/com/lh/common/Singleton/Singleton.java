/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Singleton;

/**
 * @author 003427
 * @version $Id: Singleton.java, v 0.1 2018-09-11 10:57 003427 Exp $$
 */
public class Singleton {

    private Singleton(){ }

    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public Singleton getSingleton(){
        return SingletonHolder.instance;
    }
}
