package com.my.jdbc_.prepareStatement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author Gzy
 * @version 1.0
 */
public class PrepareStatement01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/db/db.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url,user,password);

        String sql = "select name,pwd  from  admin where name = ? and pwd = ? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"aa");
        ps.setString(2,"123");
        ResultSet resultSet = ps.executeQuery();



        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        

        resultSet.close();
        ps.close();
        conn.close();



    }
}
