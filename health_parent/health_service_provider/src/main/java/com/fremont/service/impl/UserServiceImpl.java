package com.fremont.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fremont.dao.PermissionDao;
import com.fremont.dao.RoleDao;
import com.fremont.dao.UserDao;
import com.fremont.pojo.Permission;
import com.fremont.pojo.Role;
import com.fremont.pojo.User;
import com.fremont.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/20-17:19
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service(interfaceClass = UserService.class)
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private PermissionDao permissionDao;


    @Override
    public User findByUsername(String username) {
        User user = userDao.findByUsername(username);
        if(user == null){
            return null;
        }
        Integer userId = user.getId();
        Set<Role> roles = roleDao.findByUserId(userId);
        if(roles != null && roles.size() > 0){
            for(Role role : roles){
                Integer roleId = role.getId();
                Set<Permission> permissions = permissionDao.findByRoleId(roleId);
                if(permissions != null && permissions.size() > 0){
                    role.setPermissions(permissions);
                }
            }
            user.setRoles(roles);
        }
        return user;
    }
}
