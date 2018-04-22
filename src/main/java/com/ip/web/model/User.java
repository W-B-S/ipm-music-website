package com.ip.web.model;

import java.util.Date;

public class User {
    private Integer id;

    private String phone;

    private String address;

    private String code;

    private String invitationCode;

    private Date createTime;

    public User(Integer id, String phone, String address, String code, String invitationCode, Date createTime) {
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.code = code;
        this.invitationCode = invitationCode;
        this.createTime = createTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}