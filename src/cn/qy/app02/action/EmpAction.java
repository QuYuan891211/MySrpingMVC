package cn.qy.app02.action;


import cn.qy.app02.entity.Emp;
import cn.qy.app02.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/emp")
public class EmpAction {
    private EmpService empService;
    @Resource(name="empService")
    public void setEmpService(EmpService empService){
        this.empService = empService;
    }
    @RequestMapping(value="/findAll")
    public @ResponseBody Map<String,Object> findAll() throws Exception {
        List<Emp> list = empService.findAll();
        for(Emp emp:list){
            System.out.println(emp.getEmpno() + " " + emp.getEname() + " " + emp.getComm() + " "
             + emp.getHiredate() + " " + emp.getSal() + " " + emp.getMgr() + " " + emp.getDeptno()
            );
        }
        Map<String, Object> map = new LinkedHashMap<String,Object>();
        map.put("total",list.size());
        map.put("rows",list);
        return map;
    }
}
