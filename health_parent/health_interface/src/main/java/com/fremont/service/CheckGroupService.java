package com.fremont.service;

import com.fremont.entity.PageResult;
import com.fremont.pojo.CheckGroup;

import java.util.List;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/17-21:10
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface CheckGroupService {

    void add(CheckGroup checkGroup, Integer[] checkitemIds);

    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    CheckGroup findById(Integer id);

    List<Integer> findCheckItemIdsByCheckGroupId(Integer id);

    void edit(CheckGroup checkGroup, Integer[] checkitemIds);

    List<CheckGroup> findAll();
}
