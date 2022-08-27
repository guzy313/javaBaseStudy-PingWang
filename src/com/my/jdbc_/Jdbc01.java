package com.my.jdbc_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import com.mysql.cj.jdbc.*;

/**
 * @author Gzy
 * @version 1.0
 */
public class Jdbc01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        //1.注册驱动
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = new Driver();

        //获取连接数据库的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/db/db.properties"));
        String url = properties.getProperty("url");

        //2.获取连接
        Connection connect = driver.connect(url, properties);

        //3.执行sql
        String sql = "insert into actor values (1,'nn','女','1999-12-08','123456')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "成功":"失败");


        //4.关闭连接资源
        statement.close();
        connect.close();



    }


}
