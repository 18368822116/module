/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.sort;

import java.util.Arrays;

/**
 * @author 003427
 * @version $Id: InsertSort.java, v 0.1 2018-09-12 10:17 003427 Exp $$
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] array = new int[]{9,7,5,6,8,3,15,4,27};
        insertSort(array);
        //System.out.println(Arrays.toString(array));
    }

    public static  void insertSort(int[] array){
        int j;
        for(int i = 1; i< array.length; i++){
            int temp = array[i];
            for(j = i; j > 0 && array[j] - array[j - 1]  < 0; j --){
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
            System.out.println("第" + i +"次排序后"+Arrays.toString(array));
        }
    }
}
