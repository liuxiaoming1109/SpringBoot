package com.evan.spring.chapter2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/11.
 * Bean在使用之前或者之后做些必要操作，Spring对Bean的声明周期的操作提供了支持
 * 1、java配置方式：使用@Bean的initMethod和destroyMethod（相当于xml配置的init-method和destroy-method）
 * 2、注解方式：利用JSR-250的@PostConstruct和@preDestroy
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
