package com.fremont.service;

import com.fremont.entity.Result;

import java.util.Map;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/19-20:55
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface OrderService {

    Result order(Map map) throws Exception;

    Map findById(Integer id) throws Exception;
}
