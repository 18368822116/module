/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Prototype;

/**
 * @author 003427
 * @version $Id: StudentPrototype.java, v 0.1 2018-09-11 10:35 003427 Exp $$
 */
public class StudentPrototype implements Prototype<StudentPrototype>{

    private int id;
    private String name;
    private Class clazz;

    @Override
    public StudentPrototype clone() {
       return new StudentPrototype();
    }
}
