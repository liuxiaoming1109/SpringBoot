package com.evan.springboot.chapter1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/8.
 * 使用注解被拦截类
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add(){

    }
}
