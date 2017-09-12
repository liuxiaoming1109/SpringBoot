package com.evan.spring.chapter3.enable;

import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

import java.lang.annotation.*;

/**
 * Created by liuxm on 2017/9/12.
 * 第一类：直接导入配置类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(SchedulingConfiguration.class)
@Documented
public @interface EnableScheduling {
}
