package com.evan.spring.chapter3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/11.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);

        System.out.printf(context.getEnvironment().getProperty("oc.name") + "系统下的列表命令为： " + listService.showListCmd());
    }
}
