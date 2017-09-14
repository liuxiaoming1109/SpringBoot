package com.evan.spring.chapter1.di;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/8.
 */
public class Main {

    public static void main(String[] args) {
        // 使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        // 获得声明配置的UseFunctionService得Bean
        UseFunctionService useFunctionService =  context.getBean(UseFunctionService.class);

        System.out.printf(useFunctionService.SayHello("word"));

        context.close();
    }
}

