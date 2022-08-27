package com.my.collection_.List_;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author Gzy
 * @version 1.0
 */
public class Vector01 {
    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        Vector vector = new Vector();
        for (int i = 0; i < 1000000; i++) {
            vector.add(i);
        }
        long e1 = System.currentTimeMillis();
        System.out.println("time1"+(e1 - s1));





    }


}
