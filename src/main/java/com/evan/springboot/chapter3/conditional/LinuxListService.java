package com.evan.springboot.chapter3.conditional;

import org.springframework.stereotype.Service;

/**
 * Created by liuxm on 2017/9/11.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}