package com.dynamic;

public class Teacher extends Person{
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach(){
        System.out.println("老师"+getName()+"teach.. 薪资:"+getSalary());
    }

}
