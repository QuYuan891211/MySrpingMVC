package cn.qy.app02.service;

import cn.qy.app02.dao.EmpDao;
import cn.qy.app02.entity.Emp;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component("empService")
public class EmpService {
    private EmpDao empDao;
    @Resource(name = "empDao")
    public void setEmpDao(EmpDao empDao){
        this.empDao = empDao;
    }
    public List<Emp> findAll() throws Exception {
       return empDao.findAll();
    }

}
