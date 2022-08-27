package com.my.collection_.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Gzy
 * @version 1.0
 */
@SuppressWarnings("all")
public class SetMethod01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("ada");
        set.add("john");
        set.add("blbl");
        set.add(null);
        set.add(new String("john"));

        set.add(new ttt("t1"));
        set.add(new ttt("t1"));

        set.remove(null);

        set.spliterator();
        /*
        for (Object st:set) {
            System.out.println(st);
        }*/
        Iterator it = set.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(" it = "+ obj +"hash = " + obj.hashCode());
        }

    }

}

class ttt{
    private String name;

    public ttt(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ttt{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof ttt))
            return false;
        if(this.getName() == ((ttt) obj).getName()){
            return true;
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
