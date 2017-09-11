package com.evan.springboot.chapter2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017/9/11.
 * Spring的事件为Bean与Bean之间的消息通信提供了支持。当一个Bean处理完一个任务后，希望另外一个Bean知道并能作出相应的处理，这时我们就需要这另外一个Bean
 * 监听当前Bean所发的事件
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("application event");

        context.close();
    }
}
