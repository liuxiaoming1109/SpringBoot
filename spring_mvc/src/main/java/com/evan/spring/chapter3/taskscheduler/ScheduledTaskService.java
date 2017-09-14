package com.evan.spring.chapter3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liuxm on 2017/9/11.
 * 计划任务执行类
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    // 声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.printf("每隔五秒执行一次 " + dateFormat.format(new Date()) + '\n');
    }

    // 使用cron属性可按照指定时间执行，本指的是每天11点28分执行；cron是UNIX和类UNIX（Linux）系统下的定时任务
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution() {
        System.out.printf("在指定时间 " + dateFormat.format(new Date()) + "执行" + '\n');
    }
}
