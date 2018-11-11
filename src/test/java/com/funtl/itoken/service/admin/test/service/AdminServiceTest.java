package com.funtl.itoken.service.admin.test.service;

import com.funtl.itoken.service.admin.ServiceAdminApplication;
import com.funtl.itoken.service.admin.domain.TbSysUser;
import com.funtl.itoken.service.admin.service.AdminService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p>Title: AdminServiceTest</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/11 20:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
public class AdminServiceTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void register() {
        TbSysUser tbSysUser = new TbSysUser();
    }

    @Test
    public void login() {
        adminService.login("Lusifer","123456");
        //Assert.assertNotNull(tbSysUser);
    }
}
