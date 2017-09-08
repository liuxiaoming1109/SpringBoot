package com.evan.springboot.chapter2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/8.
 *
 * 知识点：
 * 1.Singleton: 一个Spring容器中只有一个Bean的实例，此为Spring的默认配置，全容器共享一个实例
 * 2.Prototype: 每次调用新建一个Bean实例
 * 3.Request: Web项目中，给每一个http request新建一个Bean实例
 * 4.Session: Web项目中国中，给每一个http session新建一个Bean实例
 * 5.GlobalSession: 这个只在portal应用中，给每一个global http session新建一个Bean实例
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.printf("s1与s2是否相等 : " + s1.equals(s2));
        System.out.printf("s1与s2是否相等 : " + p1.equals(p2));

        context.close();
    }
}
