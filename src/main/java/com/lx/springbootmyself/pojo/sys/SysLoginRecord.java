package com.lx.springbootmyself.pojo.sys;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.util.Date;

@Table(name="sys_login_record")
public class SysLoginRecord {
    @Column(name = "id", type = MySqlTypeConstant.VARCHAR, isKey = true)
    private String id;
    @Column(name = "user_id", type = MySqlTypeConstant.VARCHAR, length = 64, isNull = false)
    private String userId;
    @Column(name = "user_name", type = MySqlTypeConstant.VARCHAR, length = 64, isNull = false)
    private String userName;
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 64, isNull = false)
    private String name;
    @Column(name = "login_time", type = MySqlTypeConstant.DATETIME)
    private Date loginTime;
    @Column(name = "cip", type = MySqlTypeConstant.VARCHAR, length = 64)
    private String cip;

    public SysLoginRecord(String id, String userId, String userName, String name, Date loginTime, String cip) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.loginTime = loginTime;
        this.cip = cip;
    }

    public SysLoginRecord() {
    }



    @Override
    public java.lang.String toString() {
        return "SysLoginRecord{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName=" + userName +
                ", name=" + name +
                ", loginTime=" + loginTime +
                ", cip=" + cip +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

}
