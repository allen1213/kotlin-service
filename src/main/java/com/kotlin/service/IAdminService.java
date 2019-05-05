package com.kotlin.service;

import com.kotlin.bean.Admin;
import com.kotlin.bean.example.AdminExample;

import java.util.List;

public interface IAdminService {

    int insertSelective(Admin admin);

    List<Admin> selectByExample(AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int deleteByPrimaryKey(Long adminId);

}
