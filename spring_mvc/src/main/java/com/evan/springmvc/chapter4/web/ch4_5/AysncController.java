package com.evan.springmvc.chapter4.web.ch4_5;

import com.evan.springmvc.chapter4.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by liuxm on 2017/9/14.
 */
@Controller
public class AysncController {
    @Autowired
    PushService pushService; // 定时任务，定时更新DeferredResult

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall() {
        // 返回客户端DeferredResult
        return pushService.getAsyncUpdate();
    }

}
