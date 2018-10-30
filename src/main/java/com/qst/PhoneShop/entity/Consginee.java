package com.qst.PhoneShop.entity;

public class Consginee {
    private  int id;
    private  int user_id;
    private  String consginee;//收货人
    private  String address;//收货地址
    private  String mobile;//收货人手机号码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getConsginee() {
        return consginee;
    }

    public void setConsginee(String consginee) {
        this.consginee = consginee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
