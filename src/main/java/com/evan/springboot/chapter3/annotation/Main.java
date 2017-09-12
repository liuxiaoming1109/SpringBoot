package com.evan.springboot.chapter3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/12.
 * 所谓元注解就是可以注解到别的注解上的注解，被注解的注解称之为组合注解，组合注解具备注解其上的元注解的功能。
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }
}
