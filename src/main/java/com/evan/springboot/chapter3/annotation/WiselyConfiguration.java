package com.evan.springboot.chapter3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by liuxm on 2017/9/12.
 * 组合注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration // 组合元注解
@ComponentScan // 组合元注解
public @interface WiselyConfiguration {
    // 覆盖value参数
    String[] value() default {};
}
