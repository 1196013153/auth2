package com.example.auth2.springoauthserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth2.springoauthserver.entity.OauthClientDetails;
import com.example.auth2.springoauthserver.mapper.OauthClientDetailsMapper;
import com.example.auth2.springoauthserver.service.IOauthClientDetailsService;
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
public class OauthClientDetailsServiceImpl extends ServiceImpl<OauthClientDetailsMapper, OauthClientDetails> implements IOauthClientDetailsService {

}
