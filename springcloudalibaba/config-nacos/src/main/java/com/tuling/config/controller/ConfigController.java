package com.tuling.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

//    @Value("${user.name}")
    public String name = "334";

    @RequestMapping("/show")
    public String show(){
        return name;
    }

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getServiceList")
    public List<ServiceInstance> getServiceList() {
        List<ServiceInstance> list = discoveryClient.getInstances("com.fubaorobot");
        return list;
    }
}
