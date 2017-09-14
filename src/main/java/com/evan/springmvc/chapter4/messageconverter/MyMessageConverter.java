package com.evan.springmvc.chapter4.messageconverter;

import com.evan.springmvc.chapter4.domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by liuxm on 2017/9/14.
 * HttpConverter用来处理request和response里的数据
 * AbstractHttpMessageConverter继承实现自定义HttpMessageConverter
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyMessageConverter() {
        // 新建一个我们自定义的媒体类型application/x-wisely
        super(new MediaType("application", "x-wisely", Charset.forName("UTF-8")));//2
    }

    /**
     * 处理请求参数
     */
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> clazz,
                                   HttpInputMessage inputMessage) throws IOException,
            HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(inputMessage.getBody(),
                Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]), tempArr[1]);
    }

    /**
     * HttpMessageConverter表明只处理DemoObj这个类
     */
    @Override
    protected boolean supports(Class<?> clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    /**
     * 处理如何输出数据到response，此例中，我们在原输出前面加上"hello:"
     */
    @Override
    protected void writeInternal(DemoObj obj, HttpOutputMessage outputMessage)
            throws IOException, HttpMessageNotWritableException {
        String out = "hello:" + obj.getId() + "-"
                + obj.getName();
        outputMessage.getBody().write(out.getBytes());
    }
}
