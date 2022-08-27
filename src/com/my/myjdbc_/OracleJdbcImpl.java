package com.my.myjdbc_;

/**
 * @author Gzy
 * @version 1.0
 */
public class OracleJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到oracle连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("oracle crud");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle连接");
    }
}
