package com.test.model;

import java.util.Date;

public class OrderDyna {
    private String orderid;

    private Integer status;

    private Integer abstatus;

    private Date creatdate;

    private Date paydate;

    private Date sampledate;

    private Date senddate;

    private Date confirmdate;

    private Date receivedate;

    private Date reportdate;

    private Date reportsenddate;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAbstatus() {
        return abstatus;
    }

    public void setAbstatus(Integer abstatus) {
        this.abstatus = abstatus;
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public Date getSampledate() {
        return sampledate;
    }

    public void setSampledate(Date sampledate) {
        this.sampledate = sampledate;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Date getConfirmdate() {
        return confirmdate;
    }

    public void setConfirmdate(Date confirmdate) {
        this.confirmdate = confirmdate;
    }

    public Date getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(Date receivedate) {
        this.receivedate = receivedate;
    }

    public Date getReportdate() {
        return reportdate;
    }

    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
    }

    public Date getReportsenddate() {
        return reportsenddate;
    }

    public void setReportsenddate(Date reportsenddate) {
        this.reportsenddate = reportsenddate;
    }
}