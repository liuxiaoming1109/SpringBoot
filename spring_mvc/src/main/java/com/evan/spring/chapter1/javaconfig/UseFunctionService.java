package com.evan.spring.chapter1.javaconfig;

/**
 * Created by liuxm on 2017/9/8.
 * 解释:
 * 1此处没有使用@Service声明Bean
 */
// 1
public class UseFunctionService {
    // 使用功能Bean
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
