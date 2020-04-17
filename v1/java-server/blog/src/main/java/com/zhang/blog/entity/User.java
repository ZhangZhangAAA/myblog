package com.zhang.blog.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @ClassName User
 * @Description 用户
 * @Author chunjia.zhang
 * @Date 2020/4/17 23:41
 **/

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sysId;//系统id

    @NotBlank
    private String id;//用户标识id

    private String userName;

    private String password;

    private String phone;

    private String email;

    private Date birthday;

    private Date create_date;

    private Integer roleId;


    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
