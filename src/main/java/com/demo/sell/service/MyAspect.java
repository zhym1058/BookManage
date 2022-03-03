package com.demo.sell.service;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Repository;

@Repository
@Aspect
public class MyAspect {

    //定义一个切点
    @Pointcut("execution(* com.demo.sell.service.BookSellService.bookSell(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }
}
