package com.example.auth2.springoauthserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: auth2
 * @description:
 * @author: yqs
 * @create: 2019-10-21 17:42
 */
@RestController
public class DemoController {
    @RequestMapping("/")
    public String index() {
        return "hello index";
    }
}