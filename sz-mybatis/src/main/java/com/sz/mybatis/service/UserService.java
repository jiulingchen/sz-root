package com.sz.mybatis.service;

import com.sz.mybatis.entity.MybatisUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author a3575 on 2017-11-13 14:03:08
 */
@Service
public interface UserService {

    /**
     * 获取所有用户
     * @return
     */
    List<MybatisUser> getUserList();

    /**
     * 获取用户
     * @param id
     *  用户id
     * @return
     */
    MybatisUser getUser(String id);

    /**
     * 添加用户
     * @param user
     */
    void addUser(MybatisUser user);

}
