package com.dynamic.equalsTest;

public class test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(1);
        person1.setName("syq");
        person1.setGender('女');

        Person person2 = new Person();
        person2.setName("syq");
        person2.setAge(1);
        person2.setGender('女');

        System.out.println("== ? " + (person1 == person2));
        System.out.println("equals ? " + person1.equals(person2));

        Person ps1 = new Person();
        Person ps2 = new Person();
        Person ps3 = ps1;
        System.out.println("ps1-hashCode:"+ps1.hashCode());
        System.out.println("ps2-hashCode:"+ps2.hashCode());
        System.out.println("ps3-hashCode:"+ps3.hashCode());

        System.out.println("ps1-toString:"+ps1.toString());


        System.out.println("person1.toString():"+person1.toString());

    }
}
