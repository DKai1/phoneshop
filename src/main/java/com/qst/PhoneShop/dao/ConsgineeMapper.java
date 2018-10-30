package com.qst.PhoneShop.dao;

import com.qst.PhoneShop.model.Consginee;

public interface ConsgineeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consginee record);

    int insertSelective(Consginee record);

    Consginee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consginee record);

    int updateByPrimaryKey(Consginee record);
}