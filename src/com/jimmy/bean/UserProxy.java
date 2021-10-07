package com.jimmy.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: Administrator
 * @date: 2021/9/12
 */


@Component
@Aspect
public class UserProxy{
    //切入点抽取

    @Pointcut(value = "execution(* com.jimmy.bean.UserInfo.add(..))")
    public void pointDemo(){}


    @Before (value = "pointDemo()")
    public void before(){
        System.out.println("UserProxy before...");
    }

   /* @After (value = "execution(* com.jimmy.bean.UserInfo.add(..))")
    public void After(){
        System.out.println("After...");
    }

    @AfterReturning (value = "execution(* com.jimmy.bean.UserInfo.add(..))")
    public void AfterReturning(){
        System.out.println("AfterReturning...");
    }

    @Around (value = "execution(* com.jimmy.bean.UserInfo.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        //在被增强方法之前添加
        System.out.println("Around before");
        //被增强方法
        proceedingJoinPoint.proceed();
        //在被增强方法之后添加
        System.out.println("Around after");
    }

    @AfterThrowing (value = "execution(* com.jimmy.bean.UserInfo.add(..))")
    public void AfterThrowing(){
        System.out.println("AfterThrowing...");
    }*/
}