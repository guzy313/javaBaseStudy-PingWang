package com.my.breakPoint;

public class Debug02 {
    public static void main(String[] args) {
        Person person = new Person("testName",11);
        System.out.println("end.");


        //动态绑定测试
        Person teacher1 = new Teacher("teacher1",66,"math");
        teacher1.work();

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void work(){
        System.out.println(getName()+"is working..");
    }
}

class Teacher extends Person{
    private String subject;


    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println(getName()+" is teaching...");
    }

    @Override
    public void work() {
        teach();
    }
}