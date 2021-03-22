package com.lx.springbootmyself.serviceImp.sys;

import com.lx.springbootmyself.mapper.sys.SysUserMapper;
import com.lx.springbootmyself.pojo.sys.SysUser;
import com.lx.springbootmyself.service.sys.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SysUserServiceImp implements SysUserService {
    @Resource
    public SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> userLogin(String name, String password) {
        List<SysUser>  flag= sysUserMapper.userLogin(name,password);

        return flag;
    }
}
