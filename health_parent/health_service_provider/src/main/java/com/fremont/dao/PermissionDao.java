package com.fremont.dao;

import com.fremont.pojo.Permission;

import java.util.Set;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/20-17:21
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface PermissionDao {
    Set<Permission> findByRoleId(int roleId);
}
