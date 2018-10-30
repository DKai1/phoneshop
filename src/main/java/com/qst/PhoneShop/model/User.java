package com.qst.PhoneShop.model;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private String sex;

    private Integer privilege;

    private Integer headimg;

    public User(Integer id, String username, String password, String phone, String sex, Integer privilege, Integer headimg) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.privilege = privilege;
        this.headimg = headimg;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    public Integer getHeadimg() {
        return headimg;
    }

    public void setHeadimg(Integer headimg) {
        this.headimg = headimg;
    }
}