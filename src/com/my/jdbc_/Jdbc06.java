package com.my.jdbc_;

import org.junit.jupiter.api.Test;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author Gzy
 * @version 1.0
 */
public class Jdbc06 {


    @Test
    public void test() throws IOException, ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/db/db.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement = conn.createStatement();

        String sql = "select *  from news ";
        ResultSet resultSet = statement.executeQuery(sql);

        /*
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String title = resultSet.getString(2);
            String content = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + title + "\t" + content + "\t" + date);

        }*/
        Class<?> cls = Class.forName("com.entity.News");

        while (resultSet.next()){
            StringBuffer buffer = new StringBuffer();
            for (Field f :cls.getDeclaredFields()) {
                if(f.getName() != "serialVersionUID"){
                    buffer.append(resultSet.getString(f.getName()) + "\t");
                }
            }
            System.out.println(buffer.toString());
        }





        resultSet.close();
        statement.close();
        conn.close();


    }


}
