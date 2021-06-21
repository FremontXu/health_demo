package com.fremont.dao;

import com.fremont.pojo.CheckGroup;
import com.fremont.pojo.CheckItem;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/17-21:12
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface CheckGroupDao {

    void add(CheckGroup checkGroup);

    void setCheckGroupAndCheckItem(Map map);

    Page<CheckGroup> selectByCondition(String queryString);

    CheckGroup findById(Integer id);

    List<Integer> findCheckItemIdsByCheckGroupId(Integer id);

    void deleteAssociation(Integer id);

    void edit(CheckGroup checkGroup);

    List<CheckGroup> findAll();
}
