package com.my.houseRental.service;

import com.my.houseRental.entity.House;
import com.my.houseRental.utils.MyUtils;

import java.util.Scanner;

public class HouseService {
    private static House[] houses = new House[0];//房屋数组
    private static Scanner scan = new Scanner(System.in);

    public static boolean menuSelect(){
        switch(scan.nextInt()){
            case 1:
                return addHouseInfo();
            case 2:
                return searchHouseInfo();
            case 3:
                return delHouseInfo();
            case 4:
                return editHouseInfo();
            case 5:
                return HouseInfoList();
            case 6:
                return exit();
            default:
                System.out.println("输入错误请重新输入!");
                return true;
        }
    }

    private static boolean addHouseInfo(){

        House[] thisHouses = new House[houses.length + 1];
        House house = new House();
        System.out.println("-----------------添加房屋-----------------");
        System.out.print("姓名:");
        house.setName(scan.next());
        System.out.print("电话:");
        house.setPhone(scan.next());
        System.out.print("地址:");
        house.setAddress(scan.next());
        System.out.print("月租:");
        house.setRent(MyUtils.inputNum());
        System.out.print("状态(未出租/已出租):");
        house.setStatus(scan.next());
        //添加原数组房屋信息
        for (int i = 0; i < houses.length; i++) {
            thisHouses[i] = houses[i];
        }
        //自动生成ID，如果之前无数据则生成1
        if(houses.length == 0){
            house.setId(houses.length + 1);//自动生成房屋ID
        }else{//自动生成ID，如果之前有数据则取最大ID+1 （防止删除某条数据之后新增ID与之前重复--简易写法）
            int max = houses.length;
            for (int i = 0; i < houses.length; i++) {
                if(max < houses[i].getId()){
                    max = houses[i].getId();
                }
            }
            house.setId(max + 1);
        }
        thisHouses[houses.length] = house;
        houses = thisHouses;
        System.out.println("-----------------添加完成-----------------");
        return MyUtils.continueOrNot();
    }

    private static boolean searchHouseInfo(){
        System.out.println("-----------------查找房源-----------------");
        System.out.print("请输入你要查找的ID：");
        int inputId = scan.nextInt();
        int countNum = 0;
        for (int i = 0; i < houses.length; i++) {
            if(inputId == houses[i].getId()){
                System.out.println(houses[i].toString());
                countNum ++;
            }
        }
        if(countNum == 0){
            System.out.println("-----------------没有该房屋-----------------");
        }
        return MyUtils.continueOrNot();
    }


    public static boolean delHouseInfo(){
        System.out.println("-----------------删除房源-----------------");
        System.out.print("请输入你要删除的房屋ID：");
        int inputId = scan.nextInt();
        if(MyUtils.trueOrNot("确认是否删除")){
            House[] thisHouses = new House[houses.length - 1];
            int countNum = 0;
            for (int i = 0; i < houses.length; i++) {
                if(houses[i].getId() == inputId){
                    countNum ++ ;
                }
            }
            if(countNum != 0){
                int countI = 0;//计数，赋了几个房屋信息
                for (int i = 0; i < houses.length; i++) {
                    if(houses[i].getId() != inputId){
                        thisHouses[countI] = houses[i];
                        countI ++ ;
                    }
                }
                houses = thisHouses;
                System.out.println("删除成功");
            }else{
                System.out.println("不存在id为"+inputId+"的房屋信息");
            }
        }
        return MyUtils.continueOrNot();
    }


    private static boolean editHouseInfo(){
        System.out.println("-----------------修改房源-----------------");
        System.out.print("请输入需要修改的房屋编号(-1退出):");
        int inputId = scan.nextInt();
        if(inputId == -1 ){

        }else{
            int countNum = 0;
            for (int i = 0; i < houses.length; i++) {
                if(inputId == houses[i].getId()){
                    System.out.print("姓名("+houses[i].getName()+"):");
                    houses[i].setName(scan.next());
                    System.out.print("电话("+houses[i].getPhone()+"):");
                    houses[i].setPhone(scan.next());
                    System.out.print("地址("+houses[i].getAddress()+"):");
                    houses[i].setAddress(scan.next());
                    System.out.print("租金("+houses[i].getRent()+"):");
                    houses[i].setRent(scan.nextDouble());
                    System.out.print("状态("+houses[i].getStatus()+"):");
                    houses[i].setStatus(scan.next());
                    System.out.println("-----------------修改完成-----------------");
                    countNum ++ ;
                    break;
                }
            }
            if(countNum == 0){
                System.out.println("没有该房屋信息");
            }
        }
        return MyUtils.continueOrNot();
    }

    private static boolean HouseInfoList(){
        System.out.println("-----------------房源列表-----------------");
        for (int i = 0; i < houses.length; i++) {
            System.out.println(houses[i].toString());
        }
        return MyUtils.continueOrNot();
    }

    private static boolean exit(){
        if(MyUtils.trueOrNot("确认是否退出")){
            return false;
        }else{
            return true;
        }

    }

}
