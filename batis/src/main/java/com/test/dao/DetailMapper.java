package com.test.dao;

import com.test.model.Detail;

public interface DetailMapper {
    int deleteByPrimaryKey(Integer detid);

    int insert(Detail record);

    int insertSelective(Detail record);

    Detail selectByPrimaryKey(Integer detid);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}