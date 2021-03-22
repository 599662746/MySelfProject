package com.lx.springbootmyself.mapper.sys;

import com.lx.springbootmyself.pojo.sys.SysLoginRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysLoginRecordMapper {
    void insertSysLoginRecord(@Param("sysLoginRecord") SysLoginRecord sysLoginRecord);
}
