package com.example.configtest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：tanghengqi
 * @date：2021-11-24 17:09
 * @description：<描述>
 */
@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${user.name}")
    public String name;

    @GetMapping("/config")
    public String config() {
        return "this name is " + name;
    }

}
