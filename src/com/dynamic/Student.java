package com.dynamic;

public class Student extends Person{

    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void study(){
        System.out.println("学生:"+getName()+"sutdy.. 得分:"+getScore());
    }

}
