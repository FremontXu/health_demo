package com.fremont.service;

import com.fremont.pojo.OrderSetting;

import java.util.List;
import java.util.Map;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/18-17:03
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface OrderSettingService {

    void add(List<OrderSetting> list);

    List<Map> getOrderSettingByMonth(String date);

    void editNumberByDate(OrderSetting orderSetting);

}
