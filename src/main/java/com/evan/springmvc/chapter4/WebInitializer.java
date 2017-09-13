package com.evan.springmvc.chapter4;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by liuxm on 2017/9/12.
 * WebApplicationInitializer 是Spring提供用来配置Servlet3.0+配置的接口，从而实现替代web.xml的位置。实现
 * 此接口将会自动被WebApplicationInitializer（用来启动servlet3.0容器）获取到。
 */
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MyMvcConfig.class);
        // 注册配置类，并将其和当前servletContext关联
        ctx.setServletContext(servletContext);
        // 注册SpringMVC的DispatcherServlet
        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
