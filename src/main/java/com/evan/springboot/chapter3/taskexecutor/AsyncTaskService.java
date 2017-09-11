package com.evan.springboot.chapter3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/11.
 * 任务执行类
 */
@Service
public class AsyncTaskService {

    // @Async表明异步方法，如果注解在类级别，则表明该类所以的方法都是异步方法
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.printf("执行异步任务 :" + i + '\n');
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.printf("执行异步任务+1 :" + (i+1) + '\n');
    }

}
