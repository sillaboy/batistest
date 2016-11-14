package com.test.model;

public class Consum {
    private Integer consumId;

    private String consumName;

    private Integer price;

    public Integer getConsumId() {
        return consumId;
    }

    public void setConsumId(Integer consumId) {
        this.consumId = consumId;
    }

    public String getConsumName() {
        return consumName;
    }

    public void setConsumName(String consumName) {
        this.consumName = consumName == null ? null : consumName.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}