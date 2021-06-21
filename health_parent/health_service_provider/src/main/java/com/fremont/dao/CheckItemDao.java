package com.fremont.dao;

import com.fremont.pojo.CheckItem;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/17-14:52
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface CheckItemDao {

    void add(CheckItem checkItem);

    Page<CheckItem> selectByCondition(String queryString);

    long findCountByCheckItemId(Integer id);

    void deleteById(Integer id);

    void edit(CheckItem checkItem);

    CheckItem findById(Integer id);

    List<CheckItem> findAll();

}
