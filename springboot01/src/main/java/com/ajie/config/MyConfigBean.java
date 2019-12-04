package com.ajie.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author: wyj
 * @date: 2019/11/27
 * @description:
 */
public class MyConfigBean {
    @Value("${myConfig.myObject.name}")
    private String name;
    @Value("${myConfig.myObject.age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}