package com.my.houseRental.utils;

import java.util.Scanner;

public class MyUtils {
    private static Scanner scan = new Scanner(System.in);

    //是否继续 输入y/n 决定返回true/false 输入错误则循环强制重新输入
    public static boolean continueOrNot(){
        boolean n = true;
        do{
            System.out.print("是否继续(y/n):");
            char input = scan.next().charAt(0);
            if(input == 'y'){
                return true;
            }
            if(input == 'n'){
                return false;
            }
            if(input != 'y' && input != 'n'){
                System.out.println("输入错误请重新输入");
                n = true;
            }
        }while(n);
        return true;
    }

    //输入y/n 决定返回true/false 输入错误则循环强制重新输入
    public static boolean trueOrNot(String text){
        boolean n = true;
        do{
            System.out.print(text+"(y/n):");
            char input = scan.next().charAt(0);
            if(input == 'y'){
                return true;
            }
            if(input == 'n'){
                return false;
            }
            if(input != 'y' && input != 'n'){
                System.out.println("输入错误请重新输入");
                n = true;
            }
        }while(n);
        return true;
    }

    //必须输入数字
    public static double inputNum(){
        String input = "";
        int inp = 0;
        for (;;) {
            input = scan.next();
            if(isNumeric(input)){
                inp = Integer.parseInt(input);
                break;
            }else{
                System.out.println("必须输入数字,输入错误请重新输入");
            }
        }
        return inp;
    }

    //判断字符串是否可以转成数字
    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }


}
