package com.my.breakPoint;

import java.util.Arrays;

public class Debug01 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += i;
            System.out.println("i = "+i);
            System.out.println("sum = "+sum);
        }
        System.out.println("退出for循环");

        int[] arr = {1,3,2,9,5};
        Arrays.sort(arr);
        Debug01.xx();

    }

    public static void xx(){
        System.out.println(1);
        System.out.println(2);
    }
}
