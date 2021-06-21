package com.fremont.service;

import com.fremont.pojo.User;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/20-17:17
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface UserService {
    User findByUsername(String username);
}
