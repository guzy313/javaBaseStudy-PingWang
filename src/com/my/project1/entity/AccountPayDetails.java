package com.my.project1.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AccountPayDetails extends Account{
    private double income;
    private double pay;
    private Date payDate;
    private String payReason;
    private String details;



    public AccountPayDetails() {
    }

    public AccountPayDetails(String menuName, String userName, String password, double balance, double income, double pay, Date payDate) {
        super(menuName, userName, password, balance);
        this.income = income;
        this.pay = pay;
        this.payDate = payDate;
    }


    //展示菜单方法
    public int menuDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------零钱通菜单-------------");
        System.out.println("\t\t\t 1 零钱通明细");
        System.out.println("\t\t\t 2 收益入账");
        System.out.println("\t\t\t 3 消费");
        System.out.println("\t\t\t 4 退\t出");
        System.out.print("请选择(1-4):");
        return scanner.nextInt();
    }

    //菜单选择方法
    public char menuSelect(int menuSelect,char exitFlag){
        Scanner scanner = new Scanner(System.in);
        switch(menuSelect){
            case 1:
                this.showDetails();
                break;
            case 2:
                this.income();
                break;
            case 3:
                this.pay();
                break;
            case 4:
                System.out.print("是否确定退出？(y/n)");
                char exitx = scanner.next().charAt(0);
                while (exitx != 'y' && exitx != 'n'){
                    System.out.println("输入错误请重新输入");
                    System.out.print("是否确定退出？(y/n)");
                    exitx = scanner.next().charAt(0);
                }
                if(exitx == 'y'){
                    exitFlag = 'n';
                    System.out.println("退出成功");
                    break ;
                }

                if(exitx == 'n'){
                    exitFlag = 'y';
                    break ;
                }
            default:
                System.out.println("输入错误");
        }
        return exitFlag;
    }



    //展示明细方法
    public void showDetails() {
        if(this.getDetails() == null){
            System.out.println("暂无收支记录");
        }else{
            System.out.println(this.getDetails());
        }

    }

    //收入方法
    public void income(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入收入金额:");
        double num = scanner.nextDouble();
        if(num <= 0){
            System.out.println("收入金额不能小于等于0");
            return;
        }
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        String dateStr = sdf.format(date);

        System.out.println("+"+num);

        this.setBalance(getBalance() + num);
        String detailsHere = "收益入账\t+"+num+"\t"
                +dateStr+"\t"+"余额:"+this.getBalance();
        if(getDetails() == null){
            this.setDetails(detailsHere);
        }else{
            this.setDetails(getDetails()+"\n"+detailsHere);
        }
    }

    //支出方法
    public void pay(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入支出金额:");
        double num = scanner.nextDouble();
        if(num <= 0){
            System.out.println("支付金额不能小于等于0");
            return;
        }
        if(num > this.getBalance()){
            System.out.println("支付金额不能大于余额");
            System.out.println("沈雨晴你没钱了");
            return;
        }
        System.out.print("支出原因:");
        String payReason = scanner.next();
        System.out.println("-"+num);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        String dateStr = sdf.format(date);

        this.setBalance(this.getBalance() - num);
        String detailsHere = payReason+"\t-"+num+"\t"
                +dateStr+"\t"+"余额:"+this.getBalance();
        if(getDetails() == null){
            this.setDetails(detailsHere);
        }else{
            this.setDetails(getDetails()+"\n"+detailsHere);
        }
    }

    public char exit(int menuSelect,char exitFlag){
        Scanner scanner = new Scanner(System.in);
        if(menuSelect != 4){
            System.out.print("是否继续使用？(y/n)");
            char continueFlag = scanner.next().charAt(0);
            continueFlag = continueOrNot(continueFlag);
            if(continueFlag == 'y'){
                exitFlag = 'y';
                return exitFlag;
            }else{
                exitFlag = 'n';
                System.out.println("退出成功");
                return exitFlag;
            }
        }
        return exitFlag;
    }

    //递归循环输入错误重新输入
    public  char continueOrNot(char continueFlag){
        Scanner scanner = new Scanner(System.in);
        if(continueFlag == 'y' || continueFlag == 'n'){
            return continueFlag;
        }else{
            System.out.println("输入错误请重新输入!");
            System.out.print("是否继续使用？(y/n)");
            continueFlag = scanner.next().charAt(0);
            return continueOrNot(continueFlag);
        }
    }


    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        //System.out.println("-------------收益入账-------------");
        this.pay = pay;
        System.out.println("-"+pay);
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getPayReason() {
        return payReason;
    }

    public void setPayReason(String payReason) {
        this.payReason = payReason;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
