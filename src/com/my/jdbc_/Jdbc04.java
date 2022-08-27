package com.my.jdbc_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Gzy
 * @version 1.0
 */
public class Jdbc04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/db/db.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //加载驱动
        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url,user,password);

        Statement statement = conn.createStatement();
        System.out.println(conn.getClass());

        statement.close();
        conn.close();


    }
}
