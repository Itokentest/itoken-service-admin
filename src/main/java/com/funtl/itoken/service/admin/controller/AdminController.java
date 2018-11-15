package com.funtl.itoken.service.admin.controller;

import com.funtl.itoken.common.domain.TbSysUser;
import com.funtl.itoken.common.dto.BaseResult;
import com.funtl.itoken.service.admin.service.AdminService;
import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Title: AdminController</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/12 16:28
 */

@RestController
public class AdminController {


    @Autowired
    private AdminService adminService;

    /**
     * 登陆
     * @param logincode
     * @param password
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public BaseResult login(String logincode, String password) {
        BaseResult baseResult = checkLogin(logincode, password);

        if (baseResult != null) {
            return baseResult;
        }

        //登陆业务
        TbSysUser tbSysUser = adminService.login(logincode, password);

        // login success
        if (tbSysUser != null) {
            return BaseResult.ok(tbSysUser);
        }

        // login fail
        else {
            return BaseResult.notOk(Lists.newArrayList(new BaseResult.Error("","登陆失败")));
        }
    }

    /**
     * 检查登陆
     * @param loginCode
     * @param password
     * @return
     */
    private BaseResult checkLogin(String loginCode, String password) {
        BaseResult baseResult = null;
        List<BaseResult.Error> errors = Lists.newArrayList();



        if (StringUtils.isBlank(loginCode) || StringUtils.isBlank(password)) {
            baseResult = BaseResult.notOk(Lists.newArrayList(
                    new BaseResult.Error("loginCode","登陆账号不能为空"),
                    new BaseResult.Error("password","密码不能为空")
            ));
        }

        return baseResult;
    }
}
