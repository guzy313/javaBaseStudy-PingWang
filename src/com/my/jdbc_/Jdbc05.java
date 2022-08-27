package com.my.jdbc_;

import org.junit.jupiter.api.Test;

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
@SuppressWarnings({"all"})
public class Jdbc05 {


    @Test
    public void testJdbc() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/db/db.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url,user,password);
        Statement statement = conn.createStatement();


        String sql = "";
        sql = "create table news (id int,title varchar(50)," +
                "content varchar(200),insertTime datetime)";
        statement.executeUpdate(sql);

        for (int i = 0; i < 5; i++) {
            sql = "insert into news values ("+i+",'title"+i+"','content"+i+"',now())";
            statement.executeUpdate(sql);
        }
        sql = "update news set content='aaa' where id = 1 ";
        statement.executeUpdate(sql);


        sql = "delete from news where id = 3 ";
        statement.executeUpdate(sql);

        System.out.println("操作成功");

        conn.close();
        statement.close();


    }


}
