package com.kotlin.service.impl;

import com.kotlin.bean.Role;
import com.kotlin.bean.example.RoleExample;
import com.kotlin.dao.RoleMapper;
import com.kotlin.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return roleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Role> selectByExample(RoleExample example) {
        return roleMapper.selectByExample(example);
    }

    @Override
    public List<Role> selectRoleByName(String roleName) {
        return roleMapper.selectRoleByName(roleName);
    }
}
