package com.my.project1.entity;

import java.util.Date;

public class Account extends Menu{
    private String userName;
    private String password;
    private double balance;


    public Account() {
    }

    public Account(String menuName, String userName, String password, double balance) {
        super(menuName);
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
