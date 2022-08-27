package com.my.homework.homework2.subject13;

public class Student extends Person{
    private String stu_id;


    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("学习...");
    }

    @Override
    public void play() {
        System.out.println(this.getName()+"玩足球");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("学生的信息:");
        System.out.println("学号:"+getStu_id());
        work(this);
        this.play();
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
