package com.my.homework.homework2;

public class SavingsAccount extends CheckingAccount{
    private int countMonthlyTimes;//免手续费次数
    public SavingsAccount(double balance) {
        super(balance);
    }
    public void earnMonthlyInterest(){
        //重置免手续费次数
        this.countMonthlyTimes = 3;
        //每个月产生利息,月利率
        this.setBalance(this.getBalance() + this.getBalance() * 0.003);
    }

    @Override
    public void deposit(double amount) {
        if(getCountMonthlyTimes() > 0){
            this.setCountMonthlyTimes(getCountMonthlyTimes() - 1);
            this.setBalance(getBalance() + amount);
        }else{
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(getCountMonthlyTimes() > 0){
            this.setCountMonthlyTimes(getCountMonthlyTimes() - 1);
            this.setBalance(getBalance() - amount);
        }else{
            super.withdraw(amount);
        }
    }

    public int getCountMonthlyTimes() {
        return countMonthlyTimes;
    }

    public void setCountMonthlyTimes(int countMonthlyTimes) {
        this.countMonthlyTimes = countMonthlyTimes;
    }
}
