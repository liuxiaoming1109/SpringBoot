package com.evan.spring.chapter2.scope;

import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/8.
 * @Service默认为Singleton，相当于@Scope("singleton")
 */
@Service
public class DemoSingletonService {
}
