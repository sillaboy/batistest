package com.test.dao;

import com.test.model.Coupon;

public interface CouponMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    Coupon selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}