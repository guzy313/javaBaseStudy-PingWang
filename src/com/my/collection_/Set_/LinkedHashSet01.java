package com.my.collection_.Set_;

import java.util.*;

/**
 * @author Gzy
 * @version 1.0
 */
public class LinkedHashSet01 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(1);
        set.add(new String("AA"));
        set.add(13);
        set.add(13);
        set.add("hhh");



        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }


    }
}
