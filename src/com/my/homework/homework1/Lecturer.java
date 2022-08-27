package com.my.homework.homework1;

//讲师类
public class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post) {
        super(name, age, post);
        this.setSalary(11000);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
