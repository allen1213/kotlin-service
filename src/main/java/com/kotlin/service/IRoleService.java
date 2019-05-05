package com.kotlin.service;

import com.kotlin.bean.Role;
import com.kotlin.bean.example.RoleExample;

import java.util.List;

public interface IRoleService {

    int insertSelective(Role record);

    int deleteByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    List<Role> selectByExample(RoleExample example);

    List<Role> selectRoleByName(String roleName);
}
