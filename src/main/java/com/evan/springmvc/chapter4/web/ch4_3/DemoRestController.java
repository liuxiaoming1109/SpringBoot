package com.evan.springmvc.chapter4.web.ch4_3;

import com.evan.springmvc.chapter4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuxm on 2017/9/13.
 */
@RestController // 声明是控制器，并且返回数据时不需要@ResponseBody
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson",
            produces={"application/json;charset=UTF-8"}) // 返还类型json
    public DemoObj getjson (DemoObj obj){
        return new DemoObj(obj.getId()+1, obj.getName()+"yy");// 直接返还对象，对象自动转换称json
    }
    @RequestMapping(value = "/getxml",
            produces={"application/xml;charset=UTF-8"})// 返还数据类型xml
    public DemoObj getxml(DemoObj obj){
        return new DemoObj(obj.getId()+1, obj.getName()+"yy");
    }
}
