package com.example.auth2.springoauthserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.auth2.springoauthserver.entity.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-10-21
 */
@Mapper
@Component
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

}
