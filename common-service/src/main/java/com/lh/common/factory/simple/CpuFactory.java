/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.factory.simple;

/**
 * @author 003427
 * @version $Id: CpuFactory.java, v 0.1 2018-09-10 11:32 003427 Exp $$
 */
public class CpuFactory {
    public static Cpu createCpu(int type){
       if(type == 1){
           return new IntelCpu(755);
       }else{
           return new AmdCpu(938);
       }
    }
}
