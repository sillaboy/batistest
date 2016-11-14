package com.test.dao;

import com.test.model.Report;

public interface ReportMapper {
    int deleteByPrimaryKey(String orderid);

    int insert(Report record);

    int insertSelective(Report record);

    Report selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}