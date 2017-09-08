package com.evan.springboot.chapter1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuxm on 2017/9/8.
 * 配置类
 * @Configuration声明当前类是一个配置类
 * @ComponentScan，自动扫描包名下所有使用@Service、@Component、@Repository和@Controller 的类并注册为Bean
 */
@Configuration
@ComponentScan("com.evan.springboot.chapter1")
public class FunctionConfig {

}
