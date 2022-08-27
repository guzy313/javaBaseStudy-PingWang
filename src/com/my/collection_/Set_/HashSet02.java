package com.my.collection_.Set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Gzy
 * @version 1.0
 */
public class HashSet02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee001("ep1",12));
        hashSet.add(new Employee001("ep1",12));
        hashSet.add(new Employee001("ep2",12));

        for (Object o:hashSet) {
            System.out.println(o);
        }
    }
}

class Employee001{
    private String name;
    private int age;

    public Employee001(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee001 that = (Employee001) o;
        return age == that.age &&
                (name == that.name);
    }

    @Override
    public String toString() {
        return "Employee001{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
