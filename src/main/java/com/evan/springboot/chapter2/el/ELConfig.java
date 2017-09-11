package com.evan.springboot.chapter2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by liuxm on 2017/9/11.
 * 配置类
 */
@Configuration
@ComponentScan("com.evan.springboot.chapter2.el")
@PropertySource("classpath:com/evan/springboot/chapter2/el/test.properties")
public class ELConfig {
    // 注入普通字符串
    @Value("I Love You!")
    private String normal;

    // 注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    // 注入表达式结果
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    // 注入其他Bean属性
    @Value("#{demoService.another}")
    private String fromAnother;

    // 注入文件资源
    @Value("classpath:com/evan/springboot/chapter2/el/test.txt")
    private Resource testFile;

    // 注入网址资源
    @Value("https://www.baidu.com/")
    private Resource testUrl;

    // 注入配置文件
    @Value("${book.name}")
    private String bookName;

    // 注入配置文件
    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        System.out.printf(normal);
        System.out.printf(osName);
        System.out.printf(String.valueOf(randomNumber));
        System.out.printf(fromAnother + '\n');

        try {
            System.out.printf(bookName + '\n');
            System.out.printf(IOUtils.toString(testFile.getInputStream()) + '\n');
            System.out.printf(environment.getProperty("book.author") + '\n');

            System.out.printf(IOUtils.toString(testUrl.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
