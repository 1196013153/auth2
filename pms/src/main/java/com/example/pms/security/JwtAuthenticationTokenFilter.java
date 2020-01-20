package com.example.pms.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import utils.JwtTokenUtil;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: auth2
 * @description:
 * @author: yqs
 * @create: 2020-01-20 23:31
 */
@Component
@Slf4j
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Value("jwt.tokenHeader")
    private String tokenHeader;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String tokenHead = "Bearer";
        String header = request.getHeader(tokenHeader);
        if (header != null && header.startsWith(tokenHead)) {
            String authToken = header.substring(tokenHead.length());
            String username = jwtTokenUtil.generateToken(authToken);
            log.debug("username is {}",username);

        }

    }
}