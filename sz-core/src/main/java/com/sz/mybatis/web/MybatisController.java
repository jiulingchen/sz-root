package com.sz.mybatis.web;

import com.netflix.discovery.converters.Auto;
import com.sz.mybatis.feign.MybatisFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author a3575 on 2017-11-13 20:33:30
 */
@Component
@RestController
@RequestMapping(value = "/Mybatis")
public class MybatisController {

    @Autowired
    public MybatisFeign mybatisFeign;

    @RequestMapping("/userList")
    public String getUserList(){
        return mybatisFeign.getUserList();
    }

    @RequestMapping("/user")
    public String getUSer(String id){
        return mybatisFeign.getUser(id);
    }

    @RequestMapping("/addUser")
    public String addUser(String username, String password){
        return mybatisFeign.addUser(username, password);
    }
}
