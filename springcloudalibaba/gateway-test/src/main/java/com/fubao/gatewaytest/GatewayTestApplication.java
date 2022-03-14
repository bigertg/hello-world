package com.fubao.gatewaytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayTestApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(GatewayTestApplication.class, args);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("---------启动失败---------");
        }
    }

}
