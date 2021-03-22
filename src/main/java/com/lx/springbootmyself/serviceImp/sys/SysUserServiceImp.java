package com.lx.springbootmyself.serviceImp.sys;

import com.lx.springbootmyself.mapper.sys.SysLoginRecordMapper;
import com.lx.springbootmyself.mapper.sys.SysUserMapper;
import com.lx.springbootmyself.pojo.sys.SysLoginRecord;
import com.lx.springbootmyself.pojo.sys.SysUser;
import com.lx.springbootmyself.service.sys.SysUserService;
import com.lx.springbootmyself.tools.StringTools;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service
public class SysUserServiceImp implements SysUserService {
    @Resource
    public SysUserMapper sysUserMapper;
    @Resource
    public SysLoginRecordMapper sysLoginRecordMapper;
    @Override
    public boolean userLogin(String name, String password,String cip) {
        List<SysUser>  sysUserList= sysUserMapper.userLogin(name,password);
        boolean flag=false;
        if (sysUserList!=null&&sysUserList.size()>0){
            Date date= new Date();
            SysUser sysUser=sysUserList.get(0);
            int i = sysUserMapper.updateLastTimeAndIp(cip, date,sysUser.getId());
            String uuid=StringTools.getUUID32();
            sysLoginRecordMapper.insertSysLoginRecord(new SysLoginRecord(
                    uuid,
                    sysUser.getId(),
                    sysUser.getUserName(),
                    sysUser.getName(),
                    new Date(),
                    cip));
            flag=true;

        }
        return flag;
    }
}
