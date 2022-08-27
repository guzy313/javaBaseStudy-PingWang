package com.my.homework.homework1;

public class Professor extends Teacher{

    public Professor(String name, int age, String post) {
        super(name, age, post);
        this.setSalary(13000);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
