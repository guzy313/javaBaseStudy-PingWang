package com.entity;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println("学生正在考试");
    }

    public void getInfo(){
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);
        System.out.println("得分"+score);
    }
}
