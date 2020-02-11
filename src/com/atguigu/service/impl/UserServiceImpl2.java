package com.atguigu.service.impl;

import com.atguigu.UserService;

/**
 * @author tzc
 * @create 2020-02-11 18:41
 */
public class UserServiceImpl2 implements UserService {
    @Override
    public void insert(String username, Integer age) {
        System.out.println(username);
        System.out.println(age);
    }

    public void a() {
        for (int i = 0; i <100; i++) {
            System.out.println(i);
        }




    }
}
