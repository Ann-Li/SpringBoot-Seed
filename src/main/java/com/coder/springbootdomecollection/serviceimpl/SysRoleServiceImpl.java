package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.SysRoleMapper;
import com.coder.springbootdomecollection.model.SysMenu;
import com.coder.springbootdomecollection.model.SysPermission;
import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.service.SysRoleService;
import com.coder.util.CollectionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer rid) {
        return sysRoleMapper.deleteByPrimaryKey(rid);
    }

    @Override
    public int deleteByVo(SysRole sysRole) {
        return sysRoleMapper.deleteByProperty(sysRole);
    }

    @Override
    public int insert(SysRole sysRole) {
        return sysRoleMapper.insert(sysRole);
    }

    @Override
    public int insertSelective(SysRole sysRole) {
        return sysRoleMapper.insertSelective(sysRole);
    }

    @Override
    public int insertToBatch(List<SysRole> sysRoles) {
        if(!CollectionUtils.isNullOrEmptyStrict(sysRoles)){
            return sysRoleMapper.insertToBatch(sysRoles);
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole sysRole) {
        return sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }

    @Override
    public int updateByPrimaryKey(SysRole sysRole) {
        return sysRoleMapper.updateByPrimaryKey(sysRole);
    }

    @Override
    public int save(SysRole sysRole) {
        if(sysRole == null){
            return 0;
        }
        SysRole temp = sysRoleMapper.selectByPrimaryKey(sysRole.getRid());
        if(temp == null){
            return sysRoleMapper.insert(sysRole);
        }
        return sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }

    @Override
    public SysRole selectByPrimaryKey(Integer rid) {
        return sysRoleMapper.selectByPrimaryKey(rid);
    }

    @Override
    public List<SysRole> selectAll(SysRole sysRole) {
        if(sysRole == null){
            sysRole = new SysRole();
        }
        List<SysRole> roles = sysRoleMapper.selectByVo(sysRole);
        if(CollectionUtils.isNullOrEmptyStrict(roles)){
            return new ArrayList<>();
        }
        return roles;
    }

    @Override
    public PageInfo<SysRole> selectPage(int pageIndex, int pageSize, SysRole sysRole) {
        PageHelper.startPage(pageIndex,pageSize);
        List<SysRole> sysRoles = sysRoleMapper.selectByVo(sysRole);
        return new PageInfo(sysRoles);
    }

    @Override
    public SysRole selectByProperty(SysRole sysRole) {
        return sysRoleMapper.selectByProperty(sysRole);
    }

    @Override
    public int findCount(SysRole sysRole) {
        return sysRoleMapper.findCount(sysRole);
    }

    @Override
    public List<SysMenu> selectMenusByPrimaryKey(Integer id) {
        return sysRoleMapper.selectMenusByPrimaryKey(id);
    }

    @Override
    public List<SysPermission> selectPermissionByPrimaryKey(Integer id) {
        return sysRoleMapper.selectPermissionByPrimaryKey(id);
    }

    @Override
    public List<SysMenu> selectOtherMenusByPrimaryKey(Integer id) {
        return sysRoleMapper.selectOtherMenusByPrimaryKey(id);
    }

    @Override
    public List<SysPermission> selectOtherPermissionByPrimaryKey(Integer id) {
        return sysRoleMapper.selectOtherPermissionByPrimaryKey(id);
    }
}
