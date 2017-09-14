package com.evan.spring.chapter1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by liuxm on 2017/9/8.
 * 编写切面
 * @Aspect 注解声明一个切面
 * @Component让此切面成为Spring容器管理的Bean
 * @Pointcut声明切点
 * @After声明一个建言，并使用@PointCut定义的切点
 *
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.evan.spring.chapter1.aop.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        // 通过反射可获得注解上的属性，然后做日志记录相关的操作
        System.out.printf("注解式拦截 " + action.name());
    }


    // 通过@Before注解声明一个建言，此建言直接使用拦截规则作为参数
    @Before("execution(* com.evan.spring.chapter1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.printf("方法规则式拦截 " + method.getName());
    }
}
