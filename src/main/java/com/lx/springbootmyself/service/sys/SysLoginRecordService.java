package com.lx.springbootmyself.service.sys;

import com.lx.springbootmyself.pojo.sys.SysLoginRecord;

import javax.annotation.Resource;

@Resource
public interface SysLoginRecordService {
    void insertSysLoginRecord(SysLoginRecord sysLoginRecord);
}
