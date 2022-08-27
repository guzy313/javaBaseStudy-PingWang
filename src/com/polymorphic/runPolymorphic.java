package com.polymorphic;
import com.polymorphic.Cat;

public class runPolymorphic {
    public static void main(String[] args) {
        /*Animal animal = new Dog();
        animal.setName("星星");
        Master master = new Master();
        master.setName("syq");
        master.feed(animal,new Bone("骨头"));
        animal = new Cat();
        animal.setName("狗子");
        master.feed(animal,new Fish("大白鲸"));

        Object obj = new Master();*/

        Animal animal = new Dog();
        animal.setName("111");
        animal.run();

        System.out.println("testshuxing"+animal.getTestshuxing());

        System.out.println(animal.getName());

        Dog dog1 = (Dog) animal;
        ((Dog) animal).dogg();
        System.out.println(animal.getName());
        System.out.println("testshuxing"+animal.getTestshuxing());


        System.out.println("比较dog1是否为Animal子类:"+(dog1 instanceof Animal));
        System.out.println("比较animal是否为Cat子类:"+(animal instanceof Cat));


        double d = 11.1;
        long l = (long)d;
        System.out.println("l:"+d);



    }
}
