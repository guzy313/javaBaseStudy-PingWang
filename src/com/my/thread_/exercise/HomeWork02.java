package com.my.thread_.exercise;

import java.util.Scanner;

/**
 * @author Gzy
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
    }


}
class T1 extends Thread{
    private boolean loop;
    private Scanner scanner = new Scanner(System.in);

    public T1() {
        this.loop = true;
    }

    @Override
    public void run() {
        T2 t2 = new T2();
        t2.start();
        while (loop){
            System.out.println("输入Q终止"+t2.getName()+"线程");
            if(scanner.next().toLowerCase().charAt(0) == 'q'){
                loop = false;
            }
        }
    }

    class T2 extends Thread{
        @Override
        public void run() {
            while (loop){
                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"执行中..");
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("线程"+Thread.currentThread().getName()+"停止执行");
        }
    }

}
