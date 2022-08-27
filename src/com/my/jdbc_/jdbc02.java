package com.my.jdbc_;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Gzy
 * @version 1.0
 */
public class jdbc02 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Driver driver = (Driver)(Class.forName("com.mysql.cj.jdbc.Driver").newInstance());

        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","syq");

        String url = "jdbc:mysql://localhost:3306/my";

        Connection connect = driver.connect(url, properties);

        Statement statement = connect.createStatement();




    }
}
