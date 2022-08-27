package com.my.jdbc_.statement_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author Gzy
 * @version 1.0
 */
public class Statement01 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        //测试sql注入的用户名密码
        String name = scanner.nextLine();
        System.out.print("请输入密码:");
        String pwd = scanner.nextLine();


        Properties properties = new Properties();
        properties.load(new FileInputStream("src/db/db.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement = conn.createStatement();



        String sql = "select *  from admin where name = '"+name+"' and pwd = '"+pwd+"' ";
        ResultSet resultSet = statement.executeQuery(sql);

        if(resultSet.next()){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }


        resultSet.close();
        statement.close();
        conn.close();
    }

    @Test
    public void test() throws IOException, ClassNotFoundException, SQLException {




    }


}
