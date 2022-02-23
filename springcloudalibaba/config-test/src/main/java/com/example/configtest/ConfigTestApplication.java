package com.example.configtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigTestApplication {

    public static void main(String[] args) {
        try{
            ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigTestApplication.class, args);

            String userName = applicationContext.getEnvironment().getProperty("user.name");
            String userAge = applicationContext.getEnvironment().getProperty("user.age");
            System.out.println("user name :" + userName + "; age: " + userAge);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
