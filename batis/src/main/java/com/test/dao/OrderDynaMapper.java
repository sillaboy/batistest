package com.test.dao;

import com.test.model.OrderDyna;

public interface OrderDynaMapper {
    int insert(OrderDyna record);

    int insertSelective(OrderDyna record);
}