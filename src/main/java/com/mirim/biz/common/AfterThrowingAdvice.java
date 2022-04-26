package com.mirim.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
    public void exceptionLog(JoinPoint jp, Exception exceptObj){
        String method = jp.getSignature().getName();
        System.out.println("[예외처리]" + method + "() 메소드 수행 중 예외 발생 ");

        if(exceptObj instanceof  IllegalArgumentException){
            System.out.println("부적합한 값이 입력되었습니다.");
        }else if(exceptObj instanceof NumberFormatException){
            System.out.println("숫자 형식의 입력값이 아닙니다.");
        }else if(exceptObj instanceof Exception){
            System.out.println("에러가 발생");
        }

    }
}
