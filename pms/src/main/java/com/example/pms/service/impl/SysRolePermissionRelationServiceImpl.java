package com.example.pms.service.impl;

import com.example.pms.entity.SysRolePermissionRelation;
import com.example.pms.mapper.SysRolePermissionRelationMapper;
import com.example.pms.service.ISysRolePermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-20
 */
@Service
public class SysRolePermissionRelationServiceImpl extends ServiceImpl<SysRolePermissionRelationMapper, SysRolePermissionRelation> implements ISysRolePermissionRelationService {

}
