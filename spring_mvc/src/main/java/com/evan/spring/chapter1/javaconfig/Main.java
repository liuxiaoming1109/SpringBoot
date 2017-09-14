package com.evan.spring.chapter1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/8.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.printf(useFunctionService.SayHello("java config"));

        context.close();
    }
}
