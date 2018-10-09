/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Test;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author 003427
 * @version $Id: Shop.java, v 0.1 2018-10-08 9:41 003427 Exp $$
 */
public class Shop {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Future<Double> futurePrice = getPrice("BestShop");
        try {
            System.out.println(futurePrice.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static Future<Double> getPrice(String product){

        return CompletableFuture.supplyAsync(() -> calcPrice(product, 0));
       /* CompletableFuture<Double> futurePrice = new CompletableFuture<Double>();
        new Thread(() -> {
            try {
                double price = calcPrice(product, 0);
                futurePrice.complete(price);
            }catch (Exception ex){
                futurePrice.completeExceptionally(ex);
            }

        }).start();
        return futurePrice;*/
    }

    public static void delay(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static double calcPrice(String product, int x){
        delay();
        return  100 / x;
        //return new Random().nextDouble() * product.charAt(0)+ product.charAt(1);
    }


}
