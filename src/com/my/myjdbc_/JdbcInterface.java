package com.my.myjdbc_;

/**
 * @author Gzy
 * @version 1.0
 */
public interface JdbcInterface {

    //连接
    public Object getConnection();

    //crud
    public void crud();

    //close
    public void close();

}
