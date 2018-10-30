package com.qst.PhoneShop.entity;

import sun.security.provider.MD5;

/**
 * 图片
 */
public class Img {
    private  int id;
    private  String Imgurl;//图片地址
    private MD5 md5;//MD5辨别图片

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgurl() {
        return Imgurl;
    }

    public void setImgurl(String imgurl) {
        Imgurl = imgurl;
    }

    public MD5 getMd5() {
        return md5;
    }

    public void setMd5(MD5 md5) {
        this.md5 = md5;
    }
}
