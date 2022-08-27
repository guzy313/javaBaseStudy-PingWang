package com.dynamic.equalsTest;

public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("bmw");
        car.setName("123");
        car = null;
        System.gc();
        System.out.println("程序退出");
        testBreakPoint();

    }

    public static void testBreakPoint(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        testxx();
        System.out.println(4);
        System.out.println(5);

    }

    public  static void testxx(){
        System.out.println("xxx");
        System.out.println("yyy");
    }

}

class Car{
    private String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收Car对象"+getName()+"空间");
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
