package com.fremont.dao;

import com.fremont.pojo.Setmeal;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/18-11:02
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface SetmealDao {

    void add(Setmeal setmeal);

    void setSetmealAndCheckGroup(Map<String,Integer> map);

    Page<Setmeal> selectByCondition(String queryString);

    List<Setmeal> findAll();

    Setmeal findById(int id);

    List<Map<String,Object>> findSetmealCount();
}
