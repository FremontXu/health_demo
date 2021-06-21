package com.fremont.service;

import com.fremont.entity.PageResult;
import com.fremont.pojo.CheckItem;

import java.util.List;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/17-14:48
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface CheckItemService {

    void add(CheckItem checkItem);

    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    void delete(Integer id);

    void edit(CheckItem checkItem);

    CheckItem findById(Integer id);

    List<CheckItem> findAll();
}
