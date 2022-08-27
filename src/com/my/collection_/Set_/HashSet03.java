package com.my.collection_.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author Gzy
 * @version 1.0
 */
public class HashSet03 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee03("n1",100,new MyDate(2021,1,1)));
        hashSet.add(new Employee03("n2",12,new MyDate(2022,2,3)));
        hashSet.add(new Employee03("n1",123,new MyDate(2021,1,1)));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }


    }
}

class Employee03{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee03(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return Objects.hash(name,birthday);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        Employee03 here = (Employee03) obj;
        return here.name == name && (here.birthday).equals(this.birthday);
    }

    @Override
    public String toString() {
        return "Employee03{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}