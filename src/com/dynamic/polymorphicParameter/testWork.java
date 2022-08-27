package com.dynamic.polymorphicParameter;

public class testWork {
    public static void main(String[] args) {
        testWork testWork = new testWork();

        Employee[] generalStaffs = new Employee[5];
        for (int i = 0; i <generalStaffs.length ; i++) {
            generalStaffs[i] = new GeneralStaff("员工"+(i+1),6000);
        }
        Employee[] managers = new Employee[2];
        for (int i = 0; i < managers.length ; i++) {
            managers[i] = new Manager("经理"+(i+1),20000,300000);
        }

        System.out.println("一般员工年收入明细:");
        for (int i = 0; i < generalStaffs.length; i++) {
            System.out.println(generalStaffs[i].getName()+":"+testWork.showEmpAnnal(generalStaffs[i]));
        }

        System.out.println("=====================");
        System.out.println("经理年收入明细:");
        for (int i = 0; i < managers.length; i++) {
            System.out.println(managers[i].getName()+":"+testWork.showEmpAnnal(managers[i]));
        }



    }

    public  double showEmpAnnal(Employee e){
        if(e instanceof GeneralStaff){
            return ((GeneralStaff)e).getAnnual();
        }else if(e instanceof Manager){
            return ((Manager)e).getAnnual();
        }else{
            System.out.println("输入的类不正确无法计算");
            return 0.0;
        }

    }


    public  void work(Employee e){
        if(e instanceof Manager){
            ((Manager)e).manage();
        }else if(e instanceof GeneralStaff){
            ((GeneralStaff)e).work();
        }else{
            System.out.println("传入的类不正确 ");
        }
    }
}
