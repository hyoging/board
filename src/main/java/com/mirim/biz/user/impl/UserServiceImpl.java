package com.mirim.biz.user.impl;

import com.mirim.biz.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    public UserVO getUser(UserVO vo){
        return userDAO.getUser(vo);
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
