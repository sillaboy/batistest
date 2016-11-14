package com.test.dao;

import com.test.model.Winnder;

public interface WinnderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Winnder record);

    int insertSelective(Winnder record);

    Winnder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Winnder record);

    int updateByPrimaryKey(Winnder record);
}