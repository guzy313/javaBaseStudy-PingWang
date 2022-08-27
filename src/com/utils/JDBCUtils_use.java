package com.utils;

import org.junit.jupiter.api.Test;

import java.sql.*;

/**
 * @author Gzy
 * @version 1.0
 */
public class JDBCUtils_use {



    @Test
    public void testSelect(){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String sql = "select *  from actor where id = ? ";
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,1);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                System.out.println("name:"+name+"\t"+"phone:"+phone);
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {
           JDBCUtils.close(resultSet,statement,connection);
        }

    }


    public void testDML() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "update actor set phone=? where id=? ";

        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);//设置不自动提交事务
            statement = connection.prepareStatement(sql);
            statement.setString(1,"11111");
            statement.setInt(2,1);
            statement.executeUpdate();
            connection.commit();//事务提交
        }catch (SQLException e){
            connection.rollback();
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null,statement,connection);
        }

    }
}
