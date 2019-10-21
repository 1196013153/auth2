package com.example.auth2.springoauthserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.example.auth2.springoauthserver.entity.SysPermission;
import com.example.auth2.springoauthserver.entity.SysUser;
import com.example.auth2.springoauthserver.mapper.SysPermissionMapper;
import com.example.auth2.springoauthserver.mapper.SysUserMapper;
import com.example.auth2.springoauthserver.service.ISysPermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: auth2
 * @description:
 * @author: yqs
 * @create: 2019-10-21 16:19
 */
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SysPermissionMapper permissionMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", s);
        SysUser sysUser = sysUserMapper.selectOne(wrapper);
        if (sysUser == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        return null;
    }
}