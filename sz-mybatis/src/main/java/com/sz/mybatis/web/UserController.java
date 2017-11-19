package com.sz.mybatis.web;

import com.sz.mybatis.entity.MybatisUser;
import com.sz.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author a3575 on 2017-11-17 21:48:22
 */
@Component
@RestController
@RequestMapping(value = "/", produces = "application/json;charset=utf-8")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/userList")
    public List<MybatisUser> getUserList(){
        return userService.getUserList();
    }

    @GetMapping("/user")
    public MybatisUser getUser(String id){
        return userService.getUser(id);
    }

    @GetMapping("/addUser")
    public MybatisUser addUser(String username, String password){
        MybatisUser user = new MybatisUser(null, username, password);
        userService.addUser(user);
        return user;
    }
}
