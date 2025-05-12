package com.example.oauth2;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForestController {

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/page-a")
    public String pageA() {
        return "hello from page -A";
    }

    @GetMapping("/secret/1")
    public String secret() {
        return "from secret 1";
    }

    @GetMapping("/secret/2")
    public String secret2() {
        return "from secret 2";
    }

    @GetMapping("/zoo")
    public String pageB() {
        return "hello from zoo";
    }
}
