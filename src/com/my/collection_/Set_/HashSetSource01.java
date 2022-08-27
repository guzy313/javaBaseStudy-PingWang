package com.my.collection_.Set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Gzy
 * @version 1.0
 */
public class HashSetSource01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        /*hashSet.add("hhh");
        hashSet.add("sss");
        hashSet.add("ppp");*/
        for (int i = 0; i < 100; i++) {
            hashSet.add(new AAA(i));
        }




        System.out.println("hashSet = " + hashSet);
    }
}

class AAA{
    private int n;

    public AAA(int n) {
        this.n = n;
    }


    @Override
    public int hashCode() {
//        return Objects.hash(n);
        return 100;
    }
}
