package com.zhang.blog.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @ClassName UserRole
 * @Description 用户角色
 * @Author chunjia.zhang
 * @Date 2020/4/18 0:09
 **/

@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private Integer roleId;//系统角色

    private Date startTime;

    private Date endTime;

}
