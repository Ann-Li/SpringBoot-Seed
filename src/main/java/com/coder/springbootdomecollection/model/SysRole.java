package com.coder.springbootdomecollection.model;

import java.io.Serializable;
import java.util.List;

public class SysRole extends BaseModel implements Serializable {

    private static final long serialVersionUID = 2388790031285434913L;

    private Integer rid;

    private String rname;

    private List<SysPermission> sysPermissionList;

    private List<SysMenu> sysMenuList;

    public List<SysPermission> getSysPermissionList() {
        return sysPermissionList;
    }

    public void setSysPermissionList(List<SysPermission> sysPermissionList) {
        this.sysPermissionList = sysPermissionList;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public List<SysMenu> getSysMenuList() {
        return sysMenuList;
    }

    public void setSysMenuList(List<SysMenu> sysMenuList) {
        this.sysMenuList = sysMenuList;
    }
}