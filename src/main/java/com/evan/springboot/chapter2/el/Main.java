package com.evan.springboot.chapter2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.tools.java.ClassPath;

/**
 * Created by liuxm on 2017/9/11.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);

        ELConfig resourceService = context.getBean(ELConfig.class);

        resourceService.outputResource();

        context.close();
    }
}
