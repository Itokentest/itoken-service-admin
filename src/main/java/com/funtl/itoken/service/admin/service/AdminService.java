package com.funtl.itoken.service.admin.service;

import com.funtl.itoken.service.admin.domain.TbSysUser;

/**
 * <p>Title: AdminService</p>
 * <p>Description: </p>
 *
 * @author wgw
 * @version 1.0.0
 * @date 2018/11/11 21:41
 */
public interface AdminService {

    public void register(TbSysUser tbSysUser);

    public TbSysUser login(String loginCode, String plantPassword);
}
