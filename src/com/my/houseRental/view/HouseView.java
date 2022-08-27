package com.my.houseRental.view;

import com.my.houseRental.service.HouseService;

public class HouseView {

    public void mainMenu(){

        boolean continueOrNot = true;
        do {
            System.out.println("-----------------房屋出租系统-----------------");
            System.out.println("1 新增房源");
            System.out.println("2 查找房屋");
            System.out.println("3 删除房屋");
            System.out.println("4 修改房屋信息");
            System.out.println("5 房屋列表");
            System.out.println("6 退\t出");
            continueOrNot = HouseService.menuSelect();

        }while (continueOrNot);
    }


}
