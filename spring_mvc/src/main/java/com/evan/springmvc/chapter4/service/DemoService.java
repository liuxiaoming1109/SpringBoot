package com.evan.springmvc.chapter4.service;

import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/14.
 * 测试服务
 */
@Service
public class DemoService {
    public String saySomething(){
        return "hello";
    }
}
