package com.my.innerclass;

public class InnerClass01 {
    public static void main(String[] args) {
        new LL(){
            @Override
            public void show() {
                System.out.println("匿名类"+getClass()+" 重写show()方法");
            }
        }.show();
        test(new Picture1());

    }

    public static void test(LL ll){
        ll.show();
    }
}

interface LL{
    void show();
}

class Picture1 implements LL{
    @Override
    public void show() {
        System.out.println("展示 picture..");
    }
}

