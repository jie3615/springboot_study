package com.ajie.controller;

import com.ajie.config.MyConfigBean;
import com.ajie.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wyj
 * @date: 2019/11/25
 * @description:
 */
@RestController
public class UserController {

    @Autowired
    private MyConfigBean myConfigBean;

    @Value("${myConfig.myObject.name}")
    private String name;
    @Value("${myConfig.myObject.age}")
    private int age;

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setName("wyj");
        user.setAge(26);
        System.out.println(name);
        System.out.println(age);
        System.out.println("#############");
        System.out.println(this.myConfigBean.getAge());
        System.out.println(this.myConfigBean.getName());
        return user;
    }
}