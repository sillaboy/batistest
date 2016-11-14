package com.test.dao;

import com.test.model.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}