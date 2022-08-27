package com.my.myjdbc_;

/**
 * @author Gzy
 * @version 1.0
 */
public class MysqlJdbcImpl implements JdbcInterface{


    @Override
    public Object getConnection() {
        System.out.println("得到mysql连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("Mysql crud");
    }

    @Override
    public void close() {
        System.out.println("关闭连接");
    }
}
