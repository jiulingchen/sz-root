package com.sz.mybatis.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author a3575 on 2017-11-13 20:27:47
 */
@FeignClient("SZ-MYBATIS")
public interface MybatisFeign {

    /**
     * 获取所有用户信息
     * @return
     */
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    String getUserList();

    /**
     * 获取指定id 的用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    String getUser(@RequestParam("id") String id);

    /**
     * 添加用户信息
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    String addUser(@RequestParam("username") String username,
                   @RequestParam("password") String password);
}
