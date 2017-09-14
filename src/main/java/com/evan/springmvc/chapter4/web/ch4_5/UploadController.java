package com.evan.springmvc.chapter4.web.ch4_5;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by liuxm on 2017/9/14.
 */
@Controller
public class UploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody
    String upload(MultipartFile file) {// MultipartFile接受上传的文件

        try {
            FileUtils.writeByteArrayToFile(new File("/Users/liuxm/Desktop/" + file.getOriginalFilename()),
                    file.getBytes()); // 接受的文件写到磁盘
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
    }
}
