package com.dynamic.equalsTest;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private char gender;

    @Override
    public boolean equals(Object o) {
       if(this == o){
           return true;
       }else if(o instanceof Person){
           return ((Person) o).name == this.name
                   && ((Person) o).age == this.age
                   && ((Person) o).gender == this.gender;
       }else{
           return false;
       }


    }


    @Override
    public String toString() {
        return super.toString()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
