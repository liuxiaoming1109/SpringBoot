package com.evan.springmvc.chapter4.web.ch4_6;

import com.evan.springmvc.chapter4.MyMvcConfig;
import com.evan.springmvc.chapter4.service.DemoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by liuxm on 2017/9/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
    @WebAppConfiguration("src/main/resources") // @WebAppConfiguration注解在类上，用来声明加载的AppConfiguration是一个WebAppConfiguration。他的属性指定的是Web资源的位置，默认为src/main/webapp,本例修改为src/main/resources
    public class TestControllerIntegrationTests {
        private MockMvc mockMvc; // MockMvc模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化

        @Autowired
        private DemoService demoService;// 测试用例中注入Spirng的Bean

    @Autowired
    WebApplicationContext wac; // 可注入WebApplicationContext

    @Autowired
    MockHttpSession session; // 可注入模拟Http Session，此处仅作演示，没有使用

    @Autowired
    MockHttpServletRequest request;  // 可注入模拟Http Request，此处仅作演示，没有使用

    @Before // 在测试之前进行的初始化工作
    public void setup() {
        mockMvc =
                MockMvcBuilders.webAppContextSetup(this.wac).build(); // MockMvc模拟MVC对象，通过MockMvcBuilders.webAppContextSetup(this.wac).build()初始化
    }

    @Test
    public void testNormalController() throws Exception{
        mockMvc.perform(get("/normal")) // 模拟向/normal进行get请求
                .andExpect(status().isOk())// 预期返回状态200
                .andExpect(view().name("page"))// 预期view的名称是page
                .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))// 预期页面转向的真正路径为/WEB-INF/classes/views/page.jsp
                .andExpect(model().attribute("msg", demoService.saySomething()));// 预期model里的值是demoService.saySomething()返回hello

    }

    @Test
    public void testRestController() throws Exception{
        mockMvc.perform(get("/testRest")) // 模拟向／testRest进行get请求
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"))
                .andExpect(content().string(demoService.saySomething()));
    }
}
