package com.evan.springmvc.chapter4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuxm on 2017/9/12.
 */
// 注解声明一个控制器
@Controller
public class HelloController {
    // 配置URL和方法之间的映射
//    @RequestMapping("/index")
//    public String hello() {
//        // 通过上面ViewResolver的Bean配置，返回值为index，说明我们的页面放置的路径为/WEB-INF/classes/views/index.jsp
//        return "index";
//    }
}
