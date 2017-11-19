package com.sz.core.web;

import com.sz.core.client.MybatisFeign;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
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
    MybatisFeign mybatisFeign;

    @ApiOperation(value = "获取用户信息列表", notes = "获取数据库中所有用户信息")
    @GetMapping(value = "/userList")
    public String getUserList(){
        return mybatisFeign.getUserList();
    }


    @ApiOperation(value = "获取用户信息", notes = "获取指定id 的用户信息")
    @ApiImplicitParam(name = "id", value = "需要查询的用户id", required = true, dataType = "String")
    @GetMapping("/user")
    public String getUSer(String id){
        return mybatisFeign.getUser(id);
    }


    @ApiOperation(value = "创建用户", notes = "添加用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "需要添加的用户名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "需要添加的用户密码", required = true, dataType = "String")
    })
    @GetMapping("/addUser")
    public String addUser(String username, String password){
        return mybatisFeign.addUser(username, password);
    }
}
