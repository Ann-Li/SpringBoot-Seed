package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.mapper.SysMenuMapper;
import com.coder.springbootdomecollection.model.SysMenu;
import com.coder.springbootdomecollection.service.SysMenuService;
import com.coder.util.CollectionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByProperty(SysMenu sysMenu) {
        return sysMenuMapper.deleteByProperty(sysMenu);
    }

    @Override
    public int insert(SysMenu sysMenu) {
        return sysMenuMapper.insert(sysMenu);
    }

    @Override
    public int insertSelective(SysMenu sysMenu) {
        return sysMenuMapper.insertSelective(sysMenu);
    }

    @Override
    public int insertToBatch(List<SysMenu> sysMenus) {
        if(!CollectionUtils.isNullOrEmptyStrict(sysMenus)){
            return sysMenuMapper.insertToBatch(sysMenus);
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SysMenu sysMenu) {
        return sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
    }

    @Override
    public int updateByPrimaryKey(SysMenu sysMenu) {
        return sysMenuMapper.updateByPrimaryKey(sysMenu);
    }

    @Override
    public SysMenu selectByPrimaryKey(Integer id) {
        return sysMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysMenu> selectAll() {
        List<SysMenu> menus = sysMenuMapper.selectAll();
        if(CollectionUtils.isNullOrEmptyStrict(menus)){
            return new ArrayList<>();
        }
        return menus;
    }

    @Override
    public PageInfo<SysMenu> selectPage(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        List<SysMenu> sysMenus = sysMenuMapper.selectAll();
        return new PageInfo<>(sysMenus);
    }

    @Override
    public int save(SysMenu sysMenu) {
        if(sysMenu == null){
            return 0;
        }
        SysMenu temp = sysMenuMapper.selectByPrimaryKey(sysMenu.getId());
        if(temp == null){
            return sysMenuMapper.insert(sysMenu);
        }
        return sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
    }

    @Override
    public int findCount(SysMenu sysMenu) {
        return sysMenuMapper.findCount(sysMenu);
    }
}
