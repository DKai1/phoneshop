package com.qst.PhoneShop.model;

public class Consginee {
    private Integer id;

    private Integer userId;

    private String consginee;

    private String address;

    private String mobile;

    public Consginee(Integer id, Integer userId, String consginee, String address, String mobile) {
        this.id = id;
        this.userId = userId;
        this.consginee = consginee;
        this.address = address;
        this.mobile = mobile;
    }

    public Consginee() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsginee() {
        return consginee;
    }

    public void setConsginee(String consginee) {
        this.consginee = consginee == null ? null : consginee.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}