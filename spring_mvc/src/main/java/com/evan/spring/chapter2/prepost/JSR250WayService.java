package com.evan.spring.chapter2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by liuxm on 2017/9/11.
 * 使用JSR250形式的Bean
 */
public class JSR250WayService {

    // 在构造函数执行完之后执行
    @PostConstruct
    public void init() {
        System.out.printf("@JSR250-init-method" + '\n');
    }

    public JSR250WayService() {
        super();
        System.out.printf("初始化构造函数-JSR250WayService" + '\n');
    }

    // 在Bean销毁之前执行
    @PreDestroy
    public void destroy() {
        System.out.printf("@JSR250-destroy-method" + '\n');
    }
}
