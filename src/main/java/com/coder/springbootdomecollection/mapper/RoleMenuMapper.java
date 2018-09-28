package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.RoleMenu;

public interface RoleMenuMapper {

    int deleteByPrimaryKey(RoleMenu roleMenu);

    int deleteByProperty(RoleMenu roleMenu);

    int insert(RoleMenu roleMenu);

}