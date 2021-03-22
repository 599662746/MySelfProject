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
        List<SysUser> flag=SysUserServiceImp.userLogin(user.getUserName(),user.getPassword());
        System.out.println(flag);
        return "login";
    }
}
