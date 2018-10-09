/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.*;

/**
 * @author 003427
 * @version $Id: Demo3.java, v 0.1 2018-10-08 16:58 003427 Exp $$
 */
public class Demo3 {
    public static long calc1(long number){
        if(number == 1){
            return number;
        }
        return number * calc1(number - 1);
    }

    public static long calc2(long init, long number){
        if(number == 1){
            return init;
        }
        //System.out.println("calc2("+ init + ","+ number +")");
        return calc2(init * number, number - 1);
    }

    public static void main(String[] args) {
        //System.out.println(calc1(10));
        //System.out.println(calc2(1,20));
        /*IntStream.rangeClosed(2, 6)
                .forEach(n -> System.out.println("Hello " + n +
                        " bottles of beer"));*/
        //IntStream.rangeClosed(1,26).forEach(Demo3::getString);
        getString(250000);
    }

    private static void getString(int n) {
        char[] buf = new char[(int) floor(log(25 * (n + 1)) / log(26))];
        for (int i = buf.length - 1; i >= 0; i--) {
            n--;
            buf[i] = (char) ('A' + n % 26);
            n /= 26;
        }

        System.out.println("buf" + buf + new String(buf));
        //return new String(buf);
    }

}
