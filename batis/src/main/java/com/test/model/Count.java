package com.test.model;

import java.util.Date;

public class Count {
    private Integer id;

    private String pageN;

    private Integer touchTime;

    private String choose;

    private String udid;

    private Date creatTime;

    private String ip;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPageN() {
        return pageN;
    }

    public void setPageN(String pageN) {
        this.pageN = pageN == null ? null : pageN.trim();
    }

    public Integer getTouchTime() {
        return touchTime;
    }

    public void setTouchTime(Integer touchTime) {
        this.touchTime = touchTime;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose == null ? null : choose.trim();
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid == null ? null : udid.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}