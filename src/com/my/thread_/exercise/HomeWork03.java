package com.my.thread_.exercise;

/**
 * @author Gzy
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        new AccountX().start();
        new AccountX().start();
    }
}

class AccountX extends Thread{
    private static int balance = 10000;
    private static Object obj = new Object();
    private boolean loop = true;
    private  int countSuccess = 0;
    private  int countFail = 0;
    @Override
    public void run() {
        while (loop){
            try {
                cost();
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"取钱失败"+this.countFail+"次");
        System.out.println(Thread.currentThread().getName()+"取钱成功"+this.countSuccess+"次");

    }

    private void cost(){
        synchronized (obj){
            int money = (int)(Math.random() * 100 + 1);
            if(money <= balance){
                balance -= money;
                System.out.println(Thread.currentThread().getName()+"取钱:"+money+"余额:"+balance);
                this.countSuccess ++;
            }else{
                this.countFail ++;
                System.out.println("余额不足"+money+"\t"+Thread.currentThread().getName()+"无法取钱");
            }
            if(balance <= 0){
                loop = false;
            }
        }

    }
}
