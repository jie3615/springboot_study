package com.ajie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: wyj
 * @date: 2019/11/26
 * @description:
 */
@SpringBootApplication
public class SpringbootApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringbootApplication.class, args);
       /* SpringApplication springApplication = new SpringApplication(SpringBootApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);*/
    }
}