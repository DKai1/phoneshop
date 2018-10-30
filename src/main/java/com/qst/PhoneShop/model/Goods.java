package com.qst.PhoneShop.model;

public class Goods {
    private Integer id;

    private String phonename;

    private Float price;

    private Integer phoneimg;

    private Integer commoditystocks;

    private Integer sellnum;

    private Integer category;

    public Goods(Integer id, String phonename, Float price, Integer phoneimg, Integer commoditystocks, Integer sellnum, Integer category) {
        this.id = id;
        this.phonename = phonename;
        this.price = price;
        this.phoneimg = phoneimg;
        this.commoditystocks = commoditystocks;
        this.sellnum = sellnum;
        this.category = category;
    }

    public Goods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename == null ? null : phonename.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getPhoneimg() {
        return phoneimg;
    }

    public void setPhoneimg(Integer phoneimg) {
        this.phoneimg = phoneimg;
    }

    public Integer getCommoditystocks() {
        return commoditystocks;
    }

    public void setCommoditystocks(Integer commoditystocks) {
        this.commoditystocks = commoditystocks;
    }

    public Integer getSellnum() {
        return sellnum;
    }

    public void setSellnum(Integer sellnum) {
        this.sellnum = sellnum;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}