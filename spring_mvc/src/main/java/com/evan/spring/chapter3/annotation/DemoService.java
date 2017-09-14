package com.evan.spring.chapter3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/12.
 * 演示服务Bean
 */
@Service
public class DemoService {
    public void outputResult() {
        System.out.printf("从组合注解配置照样获得的Bean");
    }
}
