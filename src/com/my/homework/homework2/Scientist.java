package com.my.homework.homework2;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double salary, double bonus) {
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
    public double annualSalary() {
        return super.annualSalary() + bonus;
    }
}
