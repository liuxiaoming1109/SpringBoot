package com.evan.spring.chapter1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/7.
 * 1、使用@Service注解声明当前UseFunctionService类是Spring管理的一个Bean
 * 2、使用@Autowired将FunctionService的实体Bean注入到UseFunctionService中，让UseFunctionService具备FunctionService功能
 * 此处使用JSR-330的@Inject注解或者JSR-250的@Resource注解是等效的
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
