package com.example.auth2.springoauthserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth2.springoauthserver.entity.SysUser;
import com.example.auth2.springoauthserver.mapper.SysUserMapper;
import com.example.auth2.springoauthserver.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-10-21
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
