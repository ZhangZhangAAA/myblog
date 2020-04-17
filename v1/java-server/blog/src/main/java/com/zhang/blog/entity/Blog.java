package com.zhang.blog.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @ClassName Blog
 * @Description 博客
 * @Author chunjia.zhang
 * @Date 2020/4/18 0:01
 **/

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String elementId;//mongodb存储文档id

    private Date createTime;

    @NotBlank
    private String type1;//所属类型1

    private String type2;//所属类型2

    private String userId;

    private String label1;

    private String label2;

    private String label3;

    private String label4;

    private String label5;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLabel1() {
        return label1;
    }

    public void setLabel1(String label1) {
        this.label1 = label1;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public String getLabel3() {
        return label3;
    }

    public void setLabel3(String label3) {
        this.label3 = label3;
    }

    public String getLabel4() {
        return label4;
    }

    public void setLabel4(String label4) {
        this.label4 = label4;
    }

    public String getLabel5() {
        return label5;
    }

    public void setLabel5(String label5) {
        this.label5 = label5;
    }
}
