package com.qst.PhoneShop.model;

public class Img {
    private Integer id;

    private String imgurl;

    private String md5;

    public Img(Integer id, String imgurl, String md5) {
        this.id = id;
        this.imgurl = imgurl;
        this.md5 = md5;
    }

    public Img() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }
}