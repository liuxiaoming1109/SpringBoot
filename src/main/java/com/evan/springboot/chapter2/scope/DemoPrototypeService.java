package com.evan.springboot.chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/8.
 * 说明：prototype 每次调用新建一个Bean的实例
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
