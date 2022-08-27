package com.my.houseRental.entity;

import java.util.Scanner;

public class HouseRental extends HouseRentalInfo{

    public void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------房屋出租系统-----------------");
        System.out.println("1 新增房源");
        System.out.println("2 查找房屋");
        System.out.println("3 删除房屋");
        System.out.println("4 修改房屋信息");
        System.out.println("5 房屋列表");
        System.out.println("6 退\t出");
        int menuSelect = scanner.nextInt();
        switch(menuSelect){
            case 1:
                addHouseInfo();
                break;
            case 2:
                searchHouseInfo();
                break;
            case 3:
                delHouseInfo();
                break;
            case 4:
                editHouseInfo();
                break;
            case 5:
                HouseInfoList();
                break;
            case 6:
                exit();
                break;
            default:
                menu();
                System.out.println("输入错误请重新输入!");
                break;
        }
    }


    public void addHouseInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------添加房屋-----------------");
        System.out.print("姓名:");
        this.setName(scanner.next());
        System.out.print("电话:");
        this.setPhone(scanner.next());
        System.out.print("地址:");
        this.setAddress(scanner.next());
        System.out.print("月租:");
        this.setRent(scanner.nextDouble());
        System.out.print("状态(未出租/已出租):");
        this.setStatus(scanner.next());

    }

    public void searchHouseInfo(){

    }

    public void delHouseInfo(){

    }

    public void editHouseInfo(){

    }

    public void HouseInfoList(){


    }

    public void exit(){

    }



}
