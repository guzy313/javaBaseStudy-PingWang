package com.dynamic.polymorphicParameter;
//一般员工
public class GeneralStaff extends Employee{


    public GeneralStaff() {
    }

    public GeneralStaff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return getSalary() * 12;
    }

    public void work(){
        System.out.println("working...");
    }

}
