package com.my;

public class extendsDetails {
    
    public static void main(String[] args) {
        /*Sub sub = new Sub();
        sub.sayOk();

        Sub sub1 = new Sub("111");
        sub1.sayOk();*/
        Son son = new Son();
        System.out.println(son.name);


    }
}

class GrandPa{
    String name = "GrandPa";
    String hobby = "旅游";
}
class Father extends GrandPa{
    String name = "Father";
    int age = 39;
}


class Son extends Father{
    String name = "Son";
}
