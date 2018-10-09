/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Test;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * @author 003427
 * @version $Id: Demo.java, v 0.1 2018-09-28 17:14 003427 Exp $$
 */
public class Demo {
    public final int value = 4;
    public void doit(){
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println(value);
            }
        };
        r.run();
    }
    public static void main(String[] args) throws InterruptedException {
        List<String> words = Arrays.asList("zhangsan","lisi","wangwu","sunqi");
        /* words.sort(String::compareToIgnoreCase);
        words.stream().forEach(System.out::println);*/

        //words.stream().map(s -> s).forEach(System.out::println);
        /*words.parallelStream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(s ->{
                    System.out.println(s);
                });*/

        ///List<Integer> lengths = words.stream().map(String::length)
       /* List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        numbers1.stream().flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i,j})).forEach(s -> {
            System.out.println(Arrays.toString(s));
        });*/
        int[] numbers = {1,8,9,7,6,3,2};
        int count = Arrays.stream(numbers).reduce(Integer::max).getAsInt();
        System.out.println(count);
    }
}
