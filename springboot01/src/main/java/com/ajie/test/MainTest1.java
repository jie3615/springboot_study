package com.ajie.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: wyj
 * @date: 2019/12/10
 * @description:
 */
public class MainTest1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<?> aClass = MainTest2.class;
        Method main = aClass.getDeclaredMethod("main", String[].class);
        main.invoke(null, new Object[]{null});

    }
}