package com.evan.springboot.chapter2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/11.
 * 需被注入的Bean
 */
@Service
public class DemoService {
    // 注入普通字符串
    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}


