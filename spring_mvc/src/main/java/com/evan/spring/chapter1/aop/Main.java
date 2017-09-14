package com.evan.spring.chapter1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/8.
 * 面向切面编程，相对于OOP面向对象编程
 * Spring的AOP的存在目的是为了解耦。AOP可以让一组类共享相同行为。在OOP中只能通过继承类和实现接口，来使代码的耦合度增强，
 * 且类继承只能为单继承，阻碍更多行为添加到一组类上，AOP弥补了OOP的不足。
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();
    }
}
