package com.trecco.dzp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
class HelloController {

    @Value("${eureka.url}")
    private String hello;

    @RequestMapping("/hello")
    public String hi() {
        return this.hello;
    }
}