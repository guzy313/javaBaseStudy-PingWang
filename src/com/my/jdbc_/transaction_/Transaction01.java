package com.my.jdbc_.transaction_;

import com.utils.JDBCUtils;

import javax.sql.rowset.RowSetWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Gzy
 * @version 1.0
 */
public class Transaction01 {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet resultSet = null;
        String sqlSelect = "select * from  account where name=? ";

        String name1 = "钟离";
        System.out.println("当前账户:" + name1);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要转账人name:");
        String name2 = scanner.nextLine();
        System.out.print("请输入要转账的金额:");
        double n = scanner.nextDouble();//转账金额


        String sql1 = "update account set balance=? where name=? ";
        String sql2 = "update account set balance=? where name=?";

        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);//设置不自动提交事务

            //获取个人账户信息
            double balance1 = 0;
            pst = connection.prepareStatement(sqlSelect);
            pst.setString(1,name1);
            resultSet = pst.executeQuery();
            boolean exist1 = false;
            while (resultSet.next()){
                System.out.println(resultSet.getString("name")+"的账户余额:"
                        +resultSet.getString("balance"));
                balance1 = resultSet.getDouble("balance");
                exist1 = true;
            }
            if(!exist1){
                throw new RuntimeException("你的账户不存在");
            }


            //获取被转账人账户信息
            double balance2 = 0;
            pst = connection.prepareStatement(sqlSelect);
            pst.setString(1,name2);
            resultSet = pst.executeQuery();
            boolean exist2 = false;
            while (resultSet.next()){
                System.out.println("被转账人-"+resultSet.getString("name")+"的账户余额:"
                        +resultSet.getString("balance"));
                balance2 = resultSet.getDouble("balance");
                exist2 = true;
            }
            if(!exist2){
                throw new RuntimeException("被转载人的账户不存在");
            }

            //操作己方账户
            pst = connection.prepareStatement(sql1);
            pst.setDouble(1,balance1 - n);
            pst.setString(2,name1);
            pst.executeUpdate();
            //操作对方账户
            pst = connection.prepareStatement(sql2);
            pst.setDouble(1,balance2 + n);
            pst.setString(2,name2);
            pst.executeUpdate();


            connection.commit();
            System.out.println("转账成功");
        }catch (SQLException e){
            System.out.println("操作失败，数据回滚");
            connection.rollback();
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(resultSet,pst,connection);
        }


    }


}
