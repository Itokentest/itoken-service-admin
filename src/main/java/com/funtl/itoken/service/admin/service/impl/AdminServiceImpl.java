package com.funtl.itoken.service.admin.service.impl;

import com.funtl.itoken.service.admin.domain.TbSysUser;
import com.funtl.itoken.service.admin.mapper.TbSysUserMapper;
import com.funtl.itoken.service.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title: AdminServiceImpl</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/11 21:43
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private TbSysUserMapper tbSysUserMapper;

    @Override
    public void register(TbSysUser tbSysUser) {

    }

    @Override
    public TbSysUser login(String loginCode, String plantPassword) {
        return null;
    }
}
