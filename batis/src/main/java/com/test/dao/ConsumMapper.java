package com.test.dao;

import com.test.model.Consum;

public interface ConsumMapper {
    int deleteByPrimaryKey(Integer consumId);

    int insert(Consum record);

    int insertSelective(Consum record);

    Consum selectByPrimaryKey(Integer consumId);

    int updateByPrimaryKeySelective(Consum record);

    int updateByPrimaryKey(Consum record);
}