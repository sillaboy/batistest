package com.test.dao;

import com.test.model.Prize;

public interface PrizeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Prize record);

    int insertSelective(Prize record);

    Prize selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Prize record);

    int updateByPrimaryKey(Prize record);
}