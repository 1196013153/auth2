package com.example.auth2.springoauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableResourceServer
@Controller
public class SpringOauthServerApplication {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringOauthServerApplication.class, args);
    }

}
