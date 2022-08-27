package com.polymorphic;

public class Animal {
    private String name;

    int testshuxing = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestshuxing() {
        return testshuxing;
    }

    public void setTestshuxing(int testshuxing) {
        this.testshuxing = testshuxing;
    }

    public void run(){
        System.out.println("动物奔跑");
    }
}
