package com.evan.springmvc.chapter4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuxm on 2017/9/13.
 * @ControllerAdvice 将对于控制器的全局配置放置在同一个位置，组合了@Componet注解，所以自动注册为Spring的Bean
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)// 在此处定义全局处理，通过@ExceptionHandler的value属性可过滤拦截的条件，在此处拦截所有的Exception
    public ModelAndView exception(Exception exception, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");// error页面
        modelAndView.addObject("errorMessage", exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute // 注解将健值对添加到全局，所以的注解@RequestMapping的方法可获得此健值对。
    public void addAttributes(Model model) {
        model.addAttribute("msg", "额外信息"); //3
    }

    @InitBinder // 注册定制WebDataBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id"); // 此处演示忽略request参数的id
    }
}
