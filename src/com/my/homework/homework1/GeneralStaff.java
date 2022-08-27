package com.my.homework.homework1;

public class GeneralStaff extends Employee{




    //  (2)普通员工工资=单日工资*天数*等级(1.0) ;
    @Override
    public void printSalary() {
        System.out.println("搬砖人-"+getName()+"工资:"+(this.getSalary()*this.getWorkDays()*1));
    }
}
