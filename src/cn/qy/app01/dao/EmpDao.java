package cn.qy.app01.dao;

import cn.qy.app01.db.JdbcUtil;
import cn.qy.app01.entity.Emp;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;


public class EmpDao {
    public void register(Emp emp) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JdbcUtil.getComboPooledDataSource());
        String sql = "insert into emps01(id,name,salary) values(?,?,?)";
        Object[] params = {emp.getId(),emp.getName(),emp.getSalary()};
        queryRunner.update(sql,params);
    }
}
