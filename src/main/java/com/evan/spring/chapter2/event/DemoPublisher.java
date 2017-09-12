package com.evan.spring.chapter2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by liuxm on 2017/9/11.
 * 事件发布类
 */
@Component
public class DemoPublisher {
    // 注入ApplicationContext用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        // 发布
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
