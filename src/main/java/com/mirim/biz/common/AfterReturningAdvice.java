package com.mirim.biz.common;

import com.mirim.biz.user.UserVO;
import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {
    public void AfterReturningLog(JoinPoint jp, Object returnObj){
        String method = jp.getSignature().getName();

        if(returnObj instanceof UserVO){    //객체 타입 판별
            UserVO user = (UserVO) returnObj;
            if(user.getRole().equals("Admin")){
                System.out.println(user.getName() + "로그인(Admin)");
            }
        }
        System.out.println("[사후처리]" + method + "() 메소드 리턴 값: " + returnObj.toString());
    }
}
