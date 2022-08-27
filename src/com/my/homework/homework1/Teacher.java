package com.my.homework.homework1;

public class Teacher {
    private String name;
    private int age;
    private String post;//职称
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, String post) {
        this.name = name;
        this.age = age;
        this.post = post;
    }

    public void introduce(){
        System.out.println("姓名:"+getName()+"\t年龄:"+getAge()+
                "\t职称:"+getPost()+"\t月薪:"+getSalary());
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
