package com.evan.springboot.chapter2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/11.
 * Profile为在不同环境下使用不同的配置提供了支持
 * 1、通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。在开发中使用@Profile注解类或者方法，达到不同情况下选择实例化不同的Bean
 * 2、通过设定jvm的spring.profiles.active参数来设置配置环境
 * 3、Web项目设置在Servlet的context parameter
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // 先将活动设置prod
        context.getEnvironment().setActiveProfiles("prod");

        // 后置注册Bean配置类，不然会报Bean未定义的错误
        context.register(ProfileConfig.class);

        // 刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.printf(demoBean.getContent());

        context.close();
    }
}
