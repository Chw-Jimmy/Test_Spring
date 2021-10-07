package com.jimmy.bean;

import org.springframework.stereotype.Component;

/**
 * @author: Administrator
 * @date: 2021/9/12
 */
//被增强类

@Component
public class UserInfo{
    public void add(){
        System.out.println("add方法");
    }
}
