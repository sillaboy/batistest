package com.test.dao;

import com.test.model.Refund;

public interface RefundMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(Refund record);

    int insertSelective(Refund record);

    Refund selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(Refund record);

    int updateByPrimaryKey(Refund record);
}