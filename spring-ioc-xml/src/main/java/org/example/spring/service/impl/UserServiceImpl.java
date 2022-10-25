package org.example.spring.service.impl;

import org.example.spring.dao.UserDao;
import org.example.spring.service.UserService;

/**
 * @author 未確認の庭師
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
