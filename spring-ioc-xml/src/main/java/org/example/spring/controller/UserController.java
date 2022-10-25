package org.example.spring.controller;

import org.example.spring.service.UserService;

/**
 * @author 未確認の庭師
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }
}
