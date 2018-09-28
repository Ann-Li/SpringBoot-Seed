package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.RolePermission;

public interface RolePermissionMapper {

    int deleteByPrimaryKey(RolePermission rolePermission);

    int deleteByProperty(RolePermission rolePermission);

    int insert(RolePermission rolePermission);

}