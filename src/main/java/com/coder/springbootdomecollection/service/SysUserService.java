package com.coder.springbootdomecollection.service;

import com.coder.springbootdomecollection.model.SysMenu;
import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SysUserService {

    SysUser selectByPrimaryKey(Integer id);

    List<SysUser> selectAll(SysUser sysUser);

    PageInfo<SysUser> selectPage(int pageIndex, int pageSize, SysUser sysUser);

    SysUser selectByProperty(SysUser sysUser);

    int deleteByPrimaryKey(Integer id);

    int deleteByVo(SysUser sysUser);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    int insertToBatch(List<SysUser> sysUsers);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    int save(SysUser sysUser);

    int findCount(SysUser sysUser);

    List<SysRole> selectRoleByPrimaryKey(Integer id);

    List<SysMenu> selectMenuByPrimaryKey(Integer id);

}
