package com.evan.springboot.chapter1.di;

import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/7.
 * 编写功能类的Bean 使用@Server注解声明当前FunctionService类是Spring管理的一个Bean
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "hello " + word + "!";
    }
}
