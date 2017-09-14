package com.evan.spring.chapter2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by liuxm on 2017/9/11.
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();

        System.out.printf("我(bean-demoListener)接收到了bean-demopublisher发布的消息:" + msg + '\n');
    }
}
