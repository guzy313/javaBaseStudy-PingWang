package com.my.homework.homework2.subject13;

public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void play(){
        System.out.println("person play ...");
    }

    public void work(Person person){
        if(person instanceof Teacher){
            ((Teacher)person).teach();
        }
        if(person instanceof Student){
            ((Student)person).study();
        }
    }

    public void getInfo(){
        System.out.println("姓名:"+getName());
        System.out.println("年龄:"+getAge());
        System.out.println("性别:"+getGender());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
