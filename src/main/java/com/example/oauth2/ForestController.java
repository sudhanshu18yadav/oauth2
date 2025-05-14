package com.example.oauth2;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Authentication;
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
    public String pageB(Authentication auth) {
        return "thei is password ::"+auth.getJks().getPassword().toString();
    }
}
