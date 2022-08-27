package com.my.homework.homework2;

public class Teacher extends Employee{
    private double classPay;

    public Teacher(String name, double salary, double classPay) {
        super(name, salary);
        this.classPay = classPay;
    }

    public double getClassPay() {
        return classPay;
    }

    public void setClassPay(double classPay) {
        this.classPay = classPay;
    }

    @Override
    public double annualSalary() {
        return super.annualSalary() + getClassPay() * 365;
    }

    public  void teach(){}
}
