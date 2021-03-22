package com.lx.springbootmyself.mapper.sys;


import com.lx.springbootmyself.pojo.sys.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;
@Mapper
public interface SysUserMapper {
    public List<SysUser> userLogin(String name, String password);
    public int updateLastTimeAndIp(String cip, Date date,String id);
}
