package com.fremont.dao;

import com.fremont.pojo.Order;

import java.util.List;
import java.util.Map;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/19-21:04
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface OrderDao {

    void add(Order order);

    List<Order> findByCondition(Order order);

    Map findById4Detail(Integer id);

    Integer findOrderCountByDate(String date);

    Integer findOrderCountAfterDate(String date);

    Integer findVisitsCountByDate(String date);

    Integer findVisitsCountAfterDate(String date);

    List<Map> findHotSetmeal();
}
