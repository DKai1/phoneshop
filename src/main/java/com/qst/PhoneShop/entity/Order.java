package com.qst.PhoneShop.entity;

import java.sql.Date;

/**
 * 订单
 */
public class Order {
    private int id;
    private  String oder_sn;//订单号
    private  int amount;//购买数量
    private  int pay_status;//支付状态
    private int user_id;
    private  int consgineeId;//收货人id
    private  int payment;// 支付方式
    private  int shipping;//送货方式
    private Date addtime ;//下单时间
    private  int phoneId;//手机商品ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOder_sn() {
        return oder_sn;
    }

    public void setOder_sn(String oder_sn) {
        this.oder_sn = oder_sn;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPay_status() {
        return pay_status;
    }

    public void setPay_status(int pay_status) {
        this.pay_status = pay_status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getConsgineeId() {
        return consgineeId;
    }

    public void setConsgineeId(int consgineeId) {
        this.consgineeId = consgineeId;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getShipping() {
        return shipping;
    }

    public void setShipping(int shipping) {
        this.shipping = shipping;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }
}
