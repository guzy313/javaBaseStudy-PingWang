package com.my.jdbc_.prepareStatement_;

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
public class PrepareStatement02 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/db/db.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn  = DriverManager.getConnection(url,user,password);
        PreparedStatement preparedStatement = null;

        String sql = "insert into admin values(?,?) ";

        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,"bb");
        preparedStatement.setString(2,"111");

        int count = preparedStatement.executeUpdate();
        if(count > 0){
            System.out.println("语句执行成功");
        }

        preparedStatement.close();
        conn.close();



    }
}
