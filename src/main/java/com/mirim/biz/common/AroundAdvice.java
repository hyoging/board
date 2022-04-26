package com.mirim.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {

    @Around("PointcutCommon.allPointcut()")
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
        String method = pjp.getSignature().getName();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();                  //before 처리
        Object obj = pjp.proceed();         // Spring 컨테이너를 통해 사용자의 요청 처리
        stopWatch.stop();                   //after
        System.out.println(method + "() 메소드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms) 초");

        return obj;                         //사용자에게 리턴
    }
}
