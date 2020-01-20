package com.example.pms.mapper;

import com.example.pms.entity.SysPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 后台用户权限表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-01-20
 */
@Mapper
@Component
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    /**
     * 根据用户id获取权限
     * @param useranem
     * @return
     */
    List<SysPermission> listPermissionByUsername(String useranem);
}
