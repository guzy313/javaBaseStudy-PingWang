package com.polymorphic;

public class Dog extends Animal{
    int testshuxing = 100;

    @Override
    public void run() {
        System.out.println("狗奔跑");
    }

    public void dogg(){
        System.out.println("www");
        this.setName("ggg");
    }

}
