package com.evan.spring.chapter1.aop;

import java.lang.annotation.*;

/**
 * Created by liuxm on 2017/9/8.
 * 注解规则注解
 * 代码解释：
 * 注解本身是没有功能的，就和xml一样。注解和xml都是一种元数据，元数据即解释数据的数据，这就是所谓配置
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
