package cn.qy.app01.action;

import cn.qy.app01.entity.Emp;
import cn.qy.app01.service.EmpService;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpAction extends AbstractCommandController {
    private EmpService empService;
    public void setEmpService(EmpService empService){this.empService = empService;}
    public EmpAction(){this.setCommandClass(Emp.class);}
    @Override
    protected ModelAndView handle(HttpServletRequest httpServletRequest,
                                  HttpServletResponse httpServletResponse,
                                  Object object,
                                  BindException e) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        Emp emp = (Emp) object;
        emp.setId();
        empService.register(emp);
        modelAndView.addObject("message","success");
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
