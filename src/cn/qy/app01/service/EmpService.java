package cn.qy.app01.service;

import cn.qy.app01.dao.EmpDao;
import cn.qy.app01.entity.Emp;

import java.sql.SQLException;

public class EmpService {
    private EmpDao empDao;
    public void setEmpDao(EmpDao empDao){
        this.empDao = empDao;
    }
    public void register(Emp emp) throws SQLException {
        empDao.register(emp);
    }

}
