package com.evan.springboot.chapter3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by liuxm on 2017/9/11.
 * BeanNameAware, ResourceLoaderAware接口，获得Bean名称和资源加载的服务
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        System.out.printf("Bean的名称为：" + beanName + '\n');

        Resource resource = loader.getResource("classpath:com/evan/springboot/chapter3/aware/test.txt");

        try {
            System.out.printf("ResourceLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
