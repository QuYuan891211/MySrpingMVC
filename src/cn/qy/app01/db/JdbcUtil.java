package cn.qy.app01.db;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {
    private static ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
    public static ComboPooledDataSource getComboPooledDataSource(){return comboPooledDataSource;}
}
