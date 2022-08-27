package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author Gzy
 * @version 1.0
 */
public class JDBCUtils {
    private static String user;
    private static String password;
    private static String url;
    private static String driver;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/db/db.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            //将编译异常转换为运行异常
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取数据库连接
     * @return
     * @throws SQLException
     */
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            //将编译异常转换为运行异常
            throw new RuntimeException(e);
        }
    }


    /**
     * 关闭连接资源
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void close(ResultSet resultSet, Statement statement,Connection connection){
       try {
           if(resultSet != null){
               resultSet.close();
           }
           if(statement != null){
               statement.close();
           }
           if (connection != null){
               connection.close();
           }
       }catch (SQLException throwables) {
           //将编译异常转换为运行异常
           throw new RuntimeException(throwables);
       }
    }




}
