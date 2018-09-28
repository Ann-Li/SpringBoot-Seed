package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.RolePermissionMapper;
import com.coder.springbootdomecollection.model.RolePermission;
import com.coder.springbootdomecollection.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rolePermissionService")
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public int deleteByPrimaryKey(RolePermission rolePermission) {
        return rolePermissionMapper.deleteByPrimaryKey(rolePermission);
    }

    @Override
    public int deleteByProperty(RolePermission rolePermission) {
        return rolePermissionMapper.deleteByProperty(rolePermission);
    }

    @Override
    public int insert(RolePermission rolePermission) {
        return rolePermissionMapper.insert(rolePermission);
    }
}
