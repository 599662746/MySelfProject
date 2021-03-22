package com.lx.springbootmyself.service.sys;


import com.lx.springbootmyself.pojo.sys.SysUser;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface SysUserService {
    public List<SysUser> userLogin(String name, String password);
}
