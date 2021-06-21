package com.fremont.controller;

import com.fremont.constant.MessageConstant;
import com.fremont.entity.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/20-20:46
 * @Since:jdk1.8
 * @Description:TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {

    //获取当前登录用户的用户名
    @RequestMapping("/getUsername")
    public Result getUsername()throws Exception{
        try{
            org.springframework.security.core.userdetails.User user =
                    (org.springframework.security.core.userdetails.User)
                            SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            return new Result(true, MessageConstant.GET_USERNAME_SUCCESS,user.getUsername());
        }catch (Exception e){
            return new Result(false, MessageConstant.GET_USERNAME_FAIL);
        }
    }


}
