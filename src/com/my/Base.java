package com.my;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

//    public Base() {
//        System.out.println("Base()...");
//    }

    public Base(int n1) {
        System.out.println("有参Base()...");
    }

    public void test100(){
        System.out.println("test100");
    }

    protected void test200(){
        System.out.println("test200");
    }

    void test300(){
        System.out.println("test300");
    }

    private void test400(){
        System.out.println("test400");
    }
}
