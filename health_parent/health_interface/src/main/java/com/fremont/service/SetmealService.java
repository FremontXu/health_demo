package com.fremont.service;

import com.fremont.entity.PageResult;
import com.fremont.pojo.Setmeal;

import java.util.List;
import java.util.Map;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/18-10:45
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface SetmealService {

    void add(Setmeal setmeal, Integer[] checkgroupIds);

    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    List<Setmeal> findAll();

    Setmeal findById(int id);

    List<Map<String,Object>> findSetmealCount();
}
