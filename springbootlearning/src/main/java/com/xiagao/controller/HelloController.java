package com.xiagao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value(value = "${my.name}")
    private String name;
    @Value("${my.message}")
    private String message;

    @RequestMapping("/hello")
    public String hello() {
        return name + "," + message;
    }
}
