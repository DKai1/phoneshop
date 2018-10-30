package com.qst.PhoneShop.model;

public class Category {
    private Integer id;

    private String catename;

    public Category(Integer id, String catename) {
        this.id = id;
        this.catename = catename;
    }

    public Category() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename == null ? null : catename.trim();
    }
}