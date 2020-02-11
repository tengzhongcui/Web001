package com.atguigu.service.impl;

import com.atguigu.UserService;

/**
 * @author tzc
 * @create 2020-02-11 18:41
 */
public class UserServiceImpl implements UserService {
    @Override
    public void insert(String username, Integer age) {
        System.out.println(username);
        System.out.println(age);
    }
}
