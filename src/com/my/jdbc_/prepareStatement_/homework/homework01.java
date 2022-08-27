package com.my.jdbc_.prepareStatement_.homework;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * @author Gzy
 * @version 1.0
 */
@SuppressWarnings("all")
public class homework01 {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/db/db.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,user,password);
        PreparedStatement preparedStatement = null;

        String sql = "";

        sql = "create table admin1 (id int,name varchar(50),pwd varchar(32))";
        preparedStatement = conn.prepareStatement(sql);
        //preparedStatement.executeUpdate();

        for (int i = 1; i <= 5; i++) {
            sql = "insert into admin1 values (?,?,?)";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,i);
            preparedStatement.setString(2,"name"+i);
            preparedStatement.setString(3,"pwd"+i);
            preparedStatement.executeUpdate();
        }

        sql = " update admin1 set name=? where id = ? ";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,"tom");
        preparedStatement.setInt(2,1);
        preparedStatement.executeUpdate();

        sql = "delete from admin1 where id = ? ";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1,5);
        preparedStatement.executeUpdate();

        preparedStatement.close();
        conn.close();





    }
}
