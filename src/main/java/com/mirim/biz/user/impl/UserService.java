package com.mirim.biz.user.impl;

import com.mirim.biz.user.UserVO;

public interface UserService {
    //CRUD 기능의 메소드 구현
    //회원등록
    UserVO getUser(UserVO vo);
}
