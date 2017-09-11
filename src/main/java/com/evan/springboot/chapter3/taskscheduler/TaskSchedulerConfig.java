package com.evan.springboot.chapter3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by liuxm on 2017/9/11.
 */
@Configuration
@ComponentScan("com.evan.springboot.chapter3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
