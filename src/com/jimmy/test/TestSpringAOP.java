package com.jimmy.test;


import com.jimmy.bean.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Administrator
 * @date: 2021/9/12
 */
public class TestSpringAOP{
    @Test
    public void test01(){
       ApplicationContext classContext = new ClassPathXmlApplicationContext("applicationContexSpringAOP.xml");
        UserInfo user = classContext.getBean("userInfo", UserInfo.class);
        user.add();
    }
}
//afetr为最终通知，意思就是不管有没有发生异常，最终都会执行，AfterReturning通知是发生异常之后则不会执行，
//没有发生异常还是会执行的；afterThrowing是发生异常之后执行。