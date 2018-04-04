package cn.qy.app02.dao;

import cn.qy.app02.db.JdbcUtil;
import cn.qy.app02.entity.Emp;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("empDao")
public class EmpDao {
    public List<Emp> findAll() throws Exception{
        QueryRunner queryRunner = new QueryRunner(JdbcUtil.getComboPooledDataSource());
        String sql = "select * from emp";
        return  queryRunner.query(sql,new BeanListHandler<Emp>(Emp.class));
    }
}
