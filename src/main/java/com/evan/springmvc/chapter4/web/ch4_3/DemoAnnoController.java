package com.evan.springmvc.chapter4.web.ch4_3;

import com.evan.springmvc.chapter4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liuxm on 2017/9/13.
 * 控制器
 */
@Controller // 注解声明此类是一个控制器
@RequestMapping("/anno") // 映射此类的访问路径
public class DemoAnnoController {

    // 此方法未标注路径，因此使用类级别的路径/anno；produces可以定制返还response的媒体类型和字符集，或需返还是json对象，
    // 则设置produces = "application/json;charset=UTF-8"
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request) { // HttpServletRequest作为参数，当然也可以接受HttpServletReponse作为参数。此处的@ResponseBody用在返回值前面
        return "url:" + request.getRequestURL() + " can access";
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")// 接受路径参数，并在方法参数前结合@PathVariable使用
    public @ResponseBody
    String demoPathVar(@PathVariable String str, //3
                       HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,str: " + str;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8") // 常规request参数请求 路径/anno/reqeustParam?id=1
    public @ResponseBody String passRequestParam(Long id,
                                                 HttpServletRequest request) {

        return "url:" + request.getRequestURL() + " can access,id: " + id;
    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")// 解释参数到对象，访问路径/anno/obj?id=1&name=xx
    @ResponseBody // 也可以用在方法上
    public String passObj(DemoObj obj, HttpServletRequest request) {

        return "url:" + request.getRequestURL()
                + " can access, obj id: " + obj.getId()+" obj name:" + obj.getName();

    }

    @RequestMapping(value = { "/name1", "/name2" }, produces = "text/plain;charset=UTF-8")// 映射不同的路径到相同的方法
    public @ResponseBody String remove(HttpServletRequest request) {

        return "url:" + request.getRequestURL() + " can access";
    }
}
