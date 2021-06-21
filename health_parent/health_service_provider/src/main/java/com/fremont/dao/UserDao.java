package com.fremont.dao;

import com.fremont.pojo.User;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/20-17:20
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface UserDao {
    User findByUsername(String username);
}
