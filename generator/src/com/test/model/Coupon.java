package com.test.model;

import java.util.Date;

public class Coupon {
    private Integer userid;

    private Integer couponid;

    private String couponInstruc;

    private Date startDate;

    private Date endDate;

    private Integer couponValue;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCouponid() {
        return couponid;
    }

    public void setCouponid(Integer couponid) {
        this.couponid = couponid;
    }

    public String getCouponInstruc() {
        return couponInstruc;
    }

    public void setCouponInstruc(String couponInstruc) {
        this.couponInstruc = couponInstruc == null ? null : couponInstruc.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(Integer couponValue) {
        this.couponValue = couponValue;
    }
}