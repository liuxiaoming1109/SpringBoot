package com.evan.spring.chapter2.prepost;

/**
 * Created by liuxm on 2017/9/11.
 * 使用@Bean形式Bean
 */
public class BeanWayService {
    public void init() {
        System.out.printf("@Bean-init-method" + '\n');
    }

    public BeanWayService() {
        super();
        System.out.printf("初始化构造函数-BeanWayService" + '\n');
    }

    public void destroy() {
        System.out.printf("@Bean-destroy-method" + '\n');
    }
}
