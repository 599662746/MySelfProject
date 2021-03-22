package com.lx.springbootmyself.pojo.sys;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.util.Date;
@Table(name="sys_user")
public class SysUser {
    @Column(name = "id", type = MySqlTypeConstant.VARCHAR, isKey = true)
    private String id;
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 64, isNull = false)
    private String name;
    @Column(name = "user_name", type = MySqlTypeConstant.VARCHAR, length = 64, isNull = false, isUnique = true)
    private String userName;
    @Column(name = "password", type = MySqlTypeConstant.VARCHAR, length = 64, isNull = false)
    private String password;
    @Column(name = "email", type = MySqlTypeConstant.VARCHAR, length = 64, isNull = false)
    private String email;
    @Column(name = "sex", type = MySqlTypeConstant.VARCHAR, length = 64, isNull = false)
    private String sex;//1 is boy 2 is girl
    @Column(name = "is_admin", type = MySqlTypeConstant.INT, isNull = false)
    private Integer isAdmin;//1 is true 2 is false
    @Column(name = "login_time", type = MySqlTypeConstant.DATETIME)
    private Date loginTime;
    @Column(name = "sign_in_time", type = MySqlTypeConstant.DATETIME)
    private Date signInTime;
    @Column(name = "last_ip", type = MySqlTypeConstant.VARCHAR, length = 64)
    private String lastIp;
    @Column(name = "state", type = MySqlTypeConstant.INT, isNull = false)
    private Integer state;//1 is normal 2 is freeze 3 is ban
    @Column(name = "profile_photo", type = MySqlTypeConstant.VARCHAR, length = 255)
    private String profilePhoto;

    public SysUser() {
    }

    public SysUser(String id, String name, String userName, String password, String email, String sex, Integer isAdmin, Date loginTime, Date signInTime, String lastIp, Integer state, String profilePhoto) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.isAdmin = isAdmin;
        this.loginTime = loginTime;
        this.signInTime = signInTime;
        this.lastIp = lastIp;
        this.state = state;
        this.profilePhoto = profilePhoto;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", isAdmin=" + isAdmin +
                ", loginTime=" + loginTime +
                ", signInTime=" + signInTime +
                ", lastIp='" + lastIp + '\'' +
                ", state=" + state +
                ", profilePhoto='" + profilePhoto + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(Date signInTime) {
        this.signInTime = signInTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
