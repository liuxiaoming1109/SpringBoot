package com.evan.spring.chapter3.enable;

import java.lang.annotation.*;

/**
 * Created by liuxm on 2017/9/12.
 * 第三类：动态注册Bean
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(AspectJAutoProxyRegistrar.class)
public @interface EnableAspectJAutoProxy {
    boolean proxyTargetClass() default false;
}
