package com.lx.springbootmyself.controller.sys;

import com.lx.springbootmyself.pojo.sys.SysUser;
import com.lx.springbootmyself.service.sys.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SysUserController {
    @Resource
    public SysUserService SysUserServiceImp;
    @RequestMapping("/userLogin")
    public Object userLogin(SysUser user,String cip){
        //cip user IP and address
        if (cip.isEmpty()){
            cip="数据异常，暂未获取到";
        }
        boolean flag=SysUserServiceImp.userLogin(user.getUserName(),user.getPassword(),cip);
        System.out.println(flag);
        return "login";
    }
}
