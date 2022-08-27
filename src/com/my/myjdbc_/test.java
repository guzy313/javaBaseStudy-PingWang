package com.my.myjdbc_;

/**
 * @author Gzy
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        JdbcInterface jdbcInterface =  new OracleJdbcImpl();
        jdbcInterface.getConnection();
        jdbcInterface.crud();
        jdbcInterface.close();
    }
}
