package com.example.pms.service.impl;

import com.example.pms.entity.SysPermission;
import com.example.pms.mapper.SysPermissionMapper;
import com.example.pms.service.ISysPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-20
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements ISysPermissionService {
    @Autowired
    private SysPermissionMapper permissionMapper;
    @Override
    public List<SysPermission> listByUsername(String username) {
        return permissionMapper.listPermissionByUsername(username);
    }
}
