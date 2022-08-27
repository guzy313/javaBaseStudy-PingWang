package com.my.homework.homework1;

public class AssociateProfessor extends Teacher{

    public AssociateProfessor() {

    }

    public AssociateProfessor(String name, int age, String post) {
        super(name, age, post);
        this.setSalary(12000);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
