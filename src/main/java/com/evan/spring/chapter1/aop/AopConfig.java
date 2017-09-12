package com.evan.spring.chapter1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by liuxm on 2017/9/8.
 * 配置类
 * @EnableAspectJAutoProxy开启Spring对AspectJ的支持
 */
@Configuration
@ComponentScan("com.evan.spring.chapter1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
