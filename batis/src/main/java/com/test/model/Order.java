package com.test.model;

import java.util.Date;

public class Order {
    private Integer id;

    private String orderid;

    private Integer userid;

    private String ordername;

    private Integer reportid;

    private Date startDate;

    private Date finishDate;

    private String receiverName;

    private String receiverAddress;

    private String postcode;

    private String postPhonenum;

    private String trackcode;

    private String sendWaybill;

    private String receiveWaybill;

    private Integer payvalue;

    private String extrainfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername == null ? null : ordername.trim();
    }

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getPostPhonenum() {
        return postPhonenum;
    }

    public void setPostPhonenum(String postPhonenum) {
        this.postPhonenum = postPhonenum == null ? null : postPhonenum.trim();
    }

    public String getTrackcode() {
        return trackcode;
    }

    public void setTrackcode(String trackcode) {
        this.trackcode = trackcode == null ? null : trackcode.trim();
    }

    public String getSendWaybill() {
        return sendWaybill;
    }

    public void setSendWaybill(String sendWaybill) {
        this.sendWaybill = sendWaybill == null ? null : sendWaybill.trim();
    }

    public String getReceiveWaybill() {
        return receiveWaybill;
    }

    public void setReceiveWaybill(String receiveWaybill) {
        this.receiveWaybill = receiveWaybill == null ? null : receiveWaybill.trim();
    }

    public Integer getPayvalue() {
        return payvalue;
    }

    public void setPayvalue(Integer payvalue) {
        this.payvalue = payvalue;
    }

    public String getExtrainfo() {
        return extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo == null ? null : extrainfo.trim();
    }
}