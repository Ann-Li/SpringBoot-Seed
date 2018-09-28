package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.RoleMenuMapper;
import com.coder.springbootdomecollection.model.RoleMenu;
import com.coder.springbootdomecollection.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public int deleteByPrimaryKey(RoleMenu roleMenu) {
        return roleMenuMapper.deleteByPrimaryKey(roleMenu);
    }

    @Override
    public int deleteByProperty(RoleMenu roleMenu) {
        return roleMenuMapper.deleteByProperty(roleMenu);
    }

    @Override
    public int insert(RoleMenu roleMenu) {
        return roleMenuMapper.insert(roleMenu);
    }
}
