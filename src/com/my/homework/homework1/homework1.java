package com.my.homework.homework1;

import com.polymorphic.Master;

public class homework1 {

    public static void main(String[] args) {
        /*
        1.定义一个Person类{name, age, job],初始化Person对象数组，
        有3个person对象，并按照age 从大到小进行排序,提示，使用冒泡排序HomeworkO1.java
        */
        Person[] person = new Person[3];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person("张"+i,(int)(Math.random()*10),"韭菜");
        }
        System.out.println("排序前:");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName()+"\t"+person[i].getAge()+"\t"+person[i].getJob());
        }

        for (int i = person.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int age = person[j].getAge();
                if(person[j].getAge() < person[j+1].getAge()){
                    person[j].setAge(person[j+1].getAge());
                    person[j+1].setAge(age);
                }
            }
        }

        System.out.println("排序后:");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName()+"\t"+person[i].getAge()+"\t"+person[i].getJob());
        }
        System.out.println("----------------第1题结束----------------------");

        /*
        2.写出四种访问修饰符和各自的访问权限Homework02.java
        */
        //public 都可以访问
        //protected 本类 本包 子类可以访问
        //默认   其他包不能访问 子类不能访问
        //private 只有本类可以访问


        /*
        (1）要求有属性“姓名name”,“年龄age”，“职称post”，“基本工资salary"
        (2)编写业务方法，introduce 0，实现输出一个教师的信息。
        (3)编写教师类的三个子类:教授类、副教授类、讲师类。工资级别分别为:教授为1.3、副教授为1.2、讲师类1.1。
            在三个子类里面都重写父类的introduce ()方法。
        (4)定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印.
         */
        Teacher teacher = new Professor("镰刀一号",66,"教授");
        teacher.introduce();
        System.out.println("----------------第3题结束----------------------");



        /*
        4.通过继承实现员工工资核算打印功能
        父类:员工类
        子类:部门经理类、普通员工类
        (1）部门经理工资=1000+单日工资*天数*等级(1.2)。
        (2)普通员工工资=单日工资*天数*等级(1.0) ;
        (3)员工属性:姓名，单日工资,工作天数
        (4)员工方法(打印工资)
        (5)普遍员工及部门经理都是员工子类，需要重写打印工资方法。
        (5)定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象,调用打印工资方法输入工资

         */
        Employee employee = new Employee();
        employee.setName("employee1");
        employee.setSalary(100);
        employee.setWorkDays(30);
        employee.printSalary();

        Manager manager = new Manager();
        manager.setName("manager1");
        manager.setSalary(1000);
        manager.setWorkDays(30);
        manager.printSalary();
        System.out.println("----------------第4题结束----------------------");





    }



}
