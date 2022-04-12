package com.mirim.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("[Before] 비즈니스 메소드 수행전에 처리할 내용");
        Object returnObj = pjp.proceed();
        System.out.println("[After] 비즈니스 메소드 수행후에 처리할 내용");
        return returnObj;
    }
}