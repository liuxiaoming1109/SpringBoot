package com.evan.springmvc.chapter4.web.ch4_6;

import com.evan.springmvc.chapter4.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuxm on 2017/9/14.
 * RestController控制器
 */
@RestController
public class MyRestController {
    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/testRest" ,produces="text/plain;charset=UTF-8")
    public @ResponseBody
    String testRest(){
        return demoService.saySomething();
    }
}
