package com.kotlin.service.impl;

import com.kotlin.bean.Admin;
import com.kotlin.bean.example.AdminExample;
import com.kotlin.dao.AdminMapper;
import com.kotlin.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int insertSelective(Admin admin) {
        return adminMapper.insertSelective(admin);
    }

    @Override
    public List<Admin> selectByExample(AdminExample example) {
        return adminMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return adminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long adminId) {
        return adminMapper.deleteByPrimaryKey(adminId);
    }
}
