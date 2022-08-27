package com.dynamic;

public class B extends A{
    public int i = 20;


    @Override
    public int sum() {
        return i + 10;
    }

    @Override
    public int sum1() {
        return i + 10;
    }

    @Override
    public int getI() {
        return i;
    }
}
