package com.my.collection_.List_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Gzy
 * @version 1.0
 */
public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.add(100);

        lst.add(200);
        lst.add(300);
        //lst.remove();
        lst.remove(1);
        System.out.println(lst.indexOf(100));

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }

        Iterator iter = lst.iterator();
        while (iter.hasNext()) {
            Object next =  iter.next();
        }
        for (Object xx:lst) {
            System.out.println(xx);
        }


    }
}
