package com.my.innerclass.staticInner;

public class staticInner01 {
    public static void main(String[] args) {
        OuterStatic01.InnerStatic01 innerStatic01 = new OuterStatic01.InnerStatic01();

        OuterStatic01.InnerStatic01 s = new OuterStatic01().newStatic01();

        OuterStatic01.InnerStatic01 ss = OuterStatic01.staticNewStatic01();


    }
}

class OuterStatic01{
    private int n1 = 10;
    private static String name = "zz";

    public void h1(){
        InnerStatic01 innerStatic01 = new InnerStatic01();
        innerStatic01.say();
    }

    private static void aa(){

    }

    //可以直接访问外部类的所有静态成员.不能访问非静态成员
    static class InnerStatic01{
        private static String name = "aa";
        public void say(){
            System.out.println(OuterStatic01.name);
        }

    }


    public InnerStatic01 newStatic01(){
        return new InnerStatic01();
    }

    public static InnerStatic01 staticNewStatic01(){
        return new InnerStatic01();
    }


}
