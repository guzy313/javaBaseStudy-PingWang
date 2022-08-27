package com.my.thread_.exercise;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * @author Gzy
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) throws Exception{
        Th02 th02 = new Th02();
        th02.start();







    }




}
class Th01 extends Thread{
    private  boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                System.out.println((int)((Math.random())*100 + 1));
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("线程1停止运行");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class Th02 extends Thread{
    private Th01 th01;
    private Scanner scanner = new Scanner(System.in);
    private boolean loop = true;

    public Th02() {
        th01 = new Th01();
    }

    @Override
    public void run() {
        th01.start();

        while (loop){
            try {
                System.out.println("输入控制命令(Q结束):");
                char c = scanner.next().toLowerCase().charAt(0);
                System.out.println("c:"+c);
                if('q' == c){
                    th01.setLoop(false);
                    this.loop = false;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


}