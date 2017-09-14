package com.evan.springmvc.chapter4.domain;

/**
 * Created by liuxm on 2017/9/12.
 * 获取request对象参数和返还对象到response
 */
public class DemoObj {
    private Long id;
    private String name;

    // jackson对对象和json做转换时一定需要此空构造
    public DemoObj() {
        super();
    }
    public DemoObj(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
