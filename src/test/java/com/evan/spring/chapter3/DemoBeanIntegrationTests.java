package com.evan.spring.chapter3;

import com.evan.spring.chapter3.fortest.TestBean;
import com.evan.spring.chapter3.fortest.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liuxm on 2017/9/12.
 *
 * SpringJUnit4ClassRunner 在Junit环境下提供Spring TestContext Framework的功能。
 * @ContextConfiguration 用来加载配置ApplicationContext，其中classes属性用来加载配置类
 * @ActiveProfiles 用来声明活动的profile
 * @Autowired 注入Bean
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;

    // 通过JUnit的Assert来校验结果是否和预期一致
    @Test
    public void testProdBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
