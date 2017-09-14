package com.evan.springmvc.chapter4.web.ch4_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by liuxm on 2017/9/14.
 * SSE(server send Event服务的发送事件)的服务器推送和基于Servlet3.0+的异步方法特性，其中一种方式需要新式浏览器的支持，第二种方式是跨浏览器的。
 */
@Controller
public class SseController {

    @RequestMapping(value="/push",produces="text/event-stream") // 这里输入媒体类型是text/event-stream，这是服务器端SSE的支持，本例演示5秒钟向浏览器推送随机消息
    public @ResponseBody
    String push(){
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + r.nextInt() +"\n\n";
    }

}
