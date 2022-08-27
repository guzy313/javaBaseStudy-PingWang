package com.my.project1;

import com.my.project1.entity.Account;
import com.my.project1.entity.AccountPayDetails;
import com.my.project1.entity.Menu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {

        Account account =  new AccountPayDetails();
        AccountPayDetails accountpayDetails = (AccountPayDetails) account;
        accountpayDetails.setBalance(1000);
        char exitFlag = 'y';
        do{

            int menuSelect = accountpayDetails.menuDetails();
            exitFlag = accountpayDetails.menuSelect(menuSelect,exitFlag);
            exitFlag = accountpayDetails.exit(menuSelect,exitFlag);
        }while(exitFlag == 'y');

    }




}
