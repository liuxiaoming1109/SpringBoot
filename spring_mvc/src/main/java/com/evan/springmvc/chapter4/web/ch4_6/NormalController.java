package com.evan.springmvc.chapter4.web.ch4_6;

import com.evan.springmvc.chapter4.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuxm on 2017/9/14.
 * 普通控制器
 */
@Controller
public class NormalController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/normal")
    public  String testPage(Model model){
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }
}
