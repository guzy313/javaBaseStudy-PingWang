package com.dynamic.polymorphicParameter;

//经理
public class Manager extends Employee{
    private double bonus;//奖金-年终

    public Manager() {
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return getSalary() * 12 + getBonus();
    }

    public void manage(){
        System.out.println("manage..");
    }
}
