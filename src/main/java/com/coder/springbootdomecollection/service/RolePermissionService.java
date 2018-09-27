package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.RolePermission;

public interface RolePermissionService {

    int deleteByPrimaryKey(RolePermission rolePermission);

    int insert(RolePermission rolePermission);

}
