package com.test.model;

public class Detail {
    private Integer detid;

    private String orderid;

    private String productName;

    private Integer productNum;

    private Integer price;

    public Integer getDetid() {
        return detid;
    }

    public void setDetid(Integer detid) {
        this.detid = detid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}