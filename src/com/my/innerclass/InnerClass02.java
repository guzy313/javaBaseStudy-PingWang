package com.my.innerclass;

public class InnerClass02 {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        Outer02.Inner02 inner02 = outer02.new Inner02();
        inner02.say();
        System.out.println("inner02 hash:"+inner02.hashCode());

        Outer02.Inner02 aa = outer02.newInner02();
        aa.say();
        System.out.println("aa hash:"+aa.hashCode());

        Outer02.Inner02 xxxxxx = new Outer02().new Inner02();

    }
}

class Outer02{
    private int n1 = 2;
    public String name = "yyy";

    class Inner02{
        public int yyy = 666;
        private int n1 = 78;
        private int yt = 55;
        public void say(){
            System.out.println(getClass()+" say().."+"内部类的n1 = "+n1+"\n外部类的n1 = "+Outer02.this.n1);
        }
    }

    public Inner02 newInner02(){
        return new Inner02();
    }

    public void x1(){
        new Inner02().say();
    }
}