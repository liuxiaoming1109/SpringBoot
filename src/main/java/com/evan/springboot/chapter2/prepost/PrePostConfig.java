package com.evan.springboot.chapter2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuxm on 2017/9/11.
 */
@Configuration
@ComponentScan("com.evan.springboot.chapter2.prepost")
public class PrePostConfig {

    // initMethod和destroyMethod指定BeanWayService类的init和destroy方法在构造之后、Bean销毁之前执行
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
