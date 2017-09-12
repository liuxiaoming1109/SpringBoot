package com.evan.spring.chapter3.conditional;

/**
 * Created by liuxm on 2017/9/11.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
