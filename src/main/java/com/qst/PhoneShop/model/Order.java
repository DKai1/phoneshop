package com.qst.PhoneShop.model;

import java.util.Date;

public class Order {
    private Integer id;

    private String orderSn;

    private Long amount;

    private Byte payStatus;

    private Integer userId;

    private Integer consgineeid;

    private Byte payment;

    private Byte shipping;

    private Date addtime;

    private Integer phoneid;

    public Order(Integer id, String orderSn, Long amount, Byte payStatus, Integer userId, Integer consgineeid, Byte payment, Byte shipping, Date addtime, Integer phoneid) {
        this.id = id;
        this.orderSn = orderSn;
        this.amount = amount;
        this.payStatus = payStatus;
        this.userId = userId;
        this.consgineeid = consgineeid;
        this.payment = payment;
        this.shipping = shipping;
        this.addtime = addtime;
        this.phoneid = phoneid;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getConsgineeid() {
        return consgineeid;
    }

    public void setConsgineeid(Integer consgineeid) {
        this.consgineeid = consgineeid;
    }

    public Byte getPayment() {
        return payment;
    }

    public void setPayment(Byte payment) {
        this.payment = payment;
    }

    public Byte getShipping() {
        return shipping;
    }

    public void setShipping(Byte shipping) {
        this.shipping = shipping;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(Integer phoneid) {
        this.phoneid = phoneid;
    }
}