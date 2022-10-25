package org.example.spring.dao.impl;

import org.example.spring.dao.UserDao;

/**
 * @author 未確認の庭師
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
