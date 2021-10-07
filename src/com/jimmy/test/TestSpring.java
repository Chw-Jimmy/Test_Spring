package com.jimmy.test;

import com.jimmy.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Administrator
 * @date: 2021/9/11
 */
public class TestSpring{
    @Test
    public void test3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContex.xml");
        User u=ac.getBean("user",User.class);
        System.out.println(u);
    }
}
