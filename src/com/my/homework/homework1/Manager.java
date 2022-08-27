package com.my.homework.homework1;

public class Manager extends Employee{


    //(1）部门经理工资=1000+单日工资*天数*等级(1.2)。
    @Override
    public void printSalary() {
        System.out.println("经理-"+getName()+"工资:"+(1000+this.getSalary()*this.getWorkDays()*1.2));
    }
}
