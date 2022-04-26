package com.mirim.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
    @Pointcut("execution(* com.mirim.biz..*Impl.*(..))")
    public void allPointcut(){}

    @Pointcut("execution(* com.mirim.biz..*Impl.get*(..))")
    public void getPointcut(){}
}