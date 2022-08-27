package com.my.jdbc_;

import java.sql.*;

/**
 * @author Gzy
 * @version 1.0
 */
public class Jdbc3 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();
        DriverManager.registerDriver(driver);

        String url = "";
        String user = "";
        String password = "";
        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement = conn.createStatement();



    }


}
