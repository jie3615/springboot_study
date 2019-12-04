package com.ajie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wyj
 * @date: 2019/11/27
 * @description:
 */
@Configuration
public class MyConfig {

    @Bean
    public MyConfigBean myConfigBean() {
        return  new MyConfigBean();
    }
}