package com.example.pms.mapper;

import com.example.pms.entity.SysRolePermissionRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-01-20
 */
@Mapper
public interface SysRolePermissionRelationMapper extends BaseMapper<SysRolePermissionRelation> {

}
