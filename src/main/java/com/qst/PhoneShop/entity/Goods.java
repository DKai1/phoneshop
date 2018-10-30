package com.qst.PhoneShop.entity;

public class Goods {
    private  int id;
    private  String phonename;//手机名称
    private  double price;//单价
    private  int phoneImg;//照片
    private  int commodityStocks;//库存
    private  int sellNum;//销量
    private  int category;//类别

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPhoneImg() {
        return phoneImg;
    }

    public void setPhoneImg(int phoneImg) {
        this.phoneImg = phoneImg;
    }

    public int getCommodityStocks() {
        return commodityStocks;
    }

    public void setCommodityStocks(int commodityStocks) {
        this.commodityStocks = commodityStocks;
    }

    public int getSellNum() {
        return sellNum;
    }

    public void setSellNum(int sellNum) {
        this.sellNum = sellNum;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
