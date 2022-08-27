package com.my.homework.homework2;


public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        //每次存款收1美元手续费
        System.out.println("存入"+amount+"手续费1美元");
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        //每次取款收1美元手续费
        System.out.println("取出"+amount+"手续费1美元");
        super.withdraw(amount + 1);
    }
}
