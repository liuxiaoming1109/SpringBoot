package com.evan.springboot.chapter3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxm on 2017 /9/11.
 * Spring的依赖注入的最大亮点就是你所有的Bean对Spring容器的存在是没有意识的，即你可以将你的容器替换成别的容器，如Google Guice，这时Bean之间的耦合度很低。
 * 但是在实际项目中，你不可避免的要使用Spring容器本身的功能资源，这时你的Bean必须要意识到Spring容器的存在，才能调用Spring所提供的资源，这就是
 * 所谓的Spring Aware 其实Spring Aware本来就是Spring设计用来框架内部使用的，若使用了Spring Aware，你的Bean将会和Spring框架耦合
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService = context.getBean(AwareService.class);

        awareService.outputResult();

        context.close();
    }
}
