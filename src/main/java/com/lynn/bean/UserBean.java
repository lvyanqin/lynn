/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lynn.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户
 *
 */
@Entity
@Table(name = "user")
public class UserBean implements Serializable {

    private static final long serialVersionUID = -3894075644880531845L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "salt")
    private String salt;

    @Column(name = "name")
    private String name;

    @Column(name = "ip")
    private String ip;

    @Column(name = "createTime")
    private Integer createTime;

    @Column(name = "address")
    private String address;

    @Column(name = "descript")
    private String descript;

    @Column(name = "idCard")
    private String idCard;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "state")
    private Integer state;

    @Column(name = "identity")
    private Integer indentity;

    @Column(name = "mobileVaildate")
    private Integer mobileVaildate;

    @Column(name = "email")
    private String email;

    @Column(name = "emailValidate")
    private Integer emailValidate;

    @Column(name = "avatar")
    private Integer avatar;

    @Column(name = "points")
    private Integer points;// 积分数

    public UserBean() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIndentity() {
        return indentity;
    }

    public void setIndentity(Integer indentity) {
        this.indentity = indentity;
    }

    public Integer getMobileVaildate() {
        return mobileVaildate;
    }

    public void setMobileVaildate(Integer mobileVaildate) {
        this.mobileVaildate = mobileVaildate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmailValidate() {
        return emailValidate;
    }

    public void setEmailValidate(Integer emailValidate) {
        this.emailValidate = emailValidate;
    }

    public Integer getAvatar() {
        return avatar;
    }

    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "用户名：" + username + "\t 密码：" + password;
    }

}
