package com.coder.springbootdomecollection.serviceimpl;

import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.service.SysRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysRoleServiceImplTest {

    @Autowired
    private SysRoleService sysRoleService;

    @Test
    public void testRole(){
        SysRole role = new SysRole();
        role.setRname("bbb");
        sysRoleService.insert(role);
        System.out.println(role.getRid());
    }

}