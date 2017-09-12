package com.evan.springboot.chapter3.enable;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.scheduling.annotation.AsyncConfigurationSelector;

import java.lang.annotation.*;

/**
 * Created by liuxm on 2017/9/12.
 * 根据条件选择配置类
 *
 * AsyncConfigurationSelector通过条件来选择需要导入的配置类，AsyncConfigurationSelector的根接口为importSelector，这个接口重写需
 * 重写selectImports方法，此方法内进行事先条件判断。
 *
 * 此例子中，若activeModel为PORXY，则返还ProxyAsyncConfiguration这个配置类；
 * 若activeModel为ASPECTJ，则返回AspectJAsyncConfiguration配置类
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AsyncConfigurationSelector.class)
public @interface EnableAsync {
    Class<? extends Annotation> annotation() default Annotation.class;
    boolean proxyTargetClass() default false;
    AdviceMode mode() default AdviceMode.PROXY;
    int order() default Ordered.LOWEST_PRECEDENCE;
}
