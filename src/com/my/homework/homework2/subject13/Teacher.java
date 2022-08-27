package com.my.homework.homework2.subject13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("教学...");
    }

    @Override
    public void play() {
        System.out.println(this.getName()+"玩象棋");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("老师的信息:");
        System.out.println("工龄:"+getWork_age());
        work(this);
        this.play();
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
