package com.lx.springbootmyself.mapper.sys;


import com.lx.springbootmyself.pojo.sys.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysUserMapper {
    public List<SysUser> userLogin(String name, String password);
}
