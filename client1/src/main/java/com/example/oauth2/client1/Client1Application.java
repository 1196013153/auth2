package com.example.oauth2.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
@Controller
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Client1Application {
    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class, args);
    }

    @RequestMapping("/")
    public String login() {
        return "index";
    }
    @RequestMapping("/securedPage")
    public String aaa() {
        return "securedPage";
    }
}
