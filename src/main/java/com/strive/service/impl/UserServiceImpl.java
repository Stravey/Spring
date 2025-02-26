package com.strive.service.impl;

import com.strive.dao.UserDao;
import com.strive.service.UserService;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("UserServiceImpl");
    }

    private UserDao userDao;

    //该方法BeanFactory调用该方法 从BeanFactory中获得userDao设置到此处
    public void setUserDao(UserDao userDao) {
        System.out.println("哈哈userDao哈哈" + userDao);
    }
}
