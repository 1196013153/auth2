package com.cjs.sso;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.auth2.springoauthserver.SpringOauthServerApplication;
import com.example.auth2.springoauthserver.entity.SysUser;
import com.example.auth2.springoauthserver.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringOauthServerApplication.class)
public class Oauth2SsoAuthServerApplicationTests {
    @Autowired
    private SysUserMapper userMapper;
    @Test
    public void contextLoads() {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", "55");
        SysUser sysUser = userMapper.selectOne(wrapper);
        System.out.println(sysUser);
    }

}

