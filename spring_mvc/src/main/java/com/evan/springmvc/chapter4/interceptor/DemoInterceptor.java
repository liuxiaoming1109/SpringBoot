package com.evan.springmvc.chapter4.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuxm on 2017/9/13.
 * 继承HandlerInterceptorAdapter类来实现自定义拦截器
 * 拦截器，业务含义为计算每一次请求的处理时间
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {

    // 重写，在请求发生前执行
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    // 在请求发生后执行
    @Override
    public void postHandle(HttpServletRequest request, //3
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为:" + new Long(endTime - startTime)+"ms");
        request.setAttribute("handlingTime", endTime - startTime);
    }
}
