package com.jimmy.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Order(1)当有多个增强类的时候，设置其优先级，Order挎号里面的数值越小，代表优先级越高
 * 也会被优先执行
 *
 * @author: Administrator
 * @date: 2021/9/13
 */
@Component
@Aspect
@Order(1)
public class PersonProxy{
    @Before (value = "execution(* com.jimmy.bean.UserInfo.add(..))")
    public void before(){
        System.out.println("PersonProxy before......");
    }
}
