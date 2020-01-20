package com.example.pms.service;

import com.example.pms.entity.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台用户权限表 服务类
 * </p>
 *
 * @author jobob
 * @since 2020-01-20
 */
public interface ISysPermissionService extends IService<SysPermission> {
    /**
     * 根据用户id获取权限
     * @param usrename
     * @return
     */
    List<SysPermission> listByUsername(String usrename);
}
