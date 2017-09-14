package com.evan.springmvc.chapter4.web.ch4_5;

import com.evan.springmvc.chapter4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuxm on 2017/9/14.
 */
@Controller
public class ConverterController {
    @RequestMapping(value = "/convert", produces = { "application/x-wisely" }) //1
    public @ResponseBody
    DemoObj convert(@RequestBody DemoObj demoObj) {

        return demoObj;

    }
}
