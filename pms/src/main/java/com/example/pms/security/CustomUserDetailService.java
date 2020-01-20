package com.example.pms.security;

import com.example.pms.entity.SysPermission;
import com.example.pms.entity.SysUser;
import com.example.pms.service.ISysPermissionService;
import com.example.pms.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: auth2
 * @description:
 * @author: yqs
 * @create: 2020-01-20 17:15
 */
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private ISysUserService userService;
    @Autowired
    private ISysPermissionService permissionService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = userService.query().eq("username", username).getEntity();
        List<SysPermission> permissions = permissionService.listByUsername(username);
        return new User(user.getUsername(), user.getPassword(), user.getStatus() == 1,
                true, true, user.getStatus() == 2,
                permissions.stream().map(permission -> new SimpleGrantedAuthority(permission.getValue())).collect(Collectors.toList()));
    }
}