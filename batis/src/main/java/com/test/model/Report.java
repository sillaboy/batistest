package com.test.model;

import java.util.Date;

public class Report {
    private String orderid;

    private String rname;

    private String gender;

    private Date birthday;

    private String provice;

    private String city;

    private String lefteye;

    private String righteye;

    private String anaphylactogen;

    private String heredityHistory;

    private String diseasHistory;

    private String reportUrl;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice == null ? null : provice.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLefteye() {
        return lefteye;
    }

    public void setLefteye(String lefteye) {
        this.lefteye = lefteye == null ? null : lefteye.trim();
    }

    public String getRighteye() {
        return righteye;
    }

    public void setRighteye(String righteye) {
        this.righteye = righteye == null ? null : righteye.trim();
    }

    public String getAnaphylactogen() {
        return anaphylactogen;
    }

    public void setAnaphylactogen(String anaphylactogen) {
        this.anaphylactogen = anaphylactogen == null ? null : anaphylactogen.trim();
    }

    public String getHeredityHistory() {
        return heredityHistory;
    }

    public void setHeredityHistory(String heredityHistory) {
        this.heredityHistory = heredityHistory == null ? null : heredityHistory.trim();
    }

    public String getDiseasHistory() {
        return diseasHistory;
    }

    public void setDiseasHistory(String diseasHistory) {
        this.diseasHistory = diseasHistory == null ? null : diseasHistory.trim();
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl == null ? null : reportUrl.trim();
    }
}