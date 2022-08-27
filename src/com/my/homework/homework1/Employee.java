package com.my.homework.homework1;

public class Employee {
    private String name;
    private double salary;
    private int workDays;

    public void printSalary(){
        System.out.print(getName()+"工资:"+(getSalary()*getWorkDays()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
}
