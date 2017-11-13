package com.sz.mybatis.service.impl;

import com.sz.mybatis.service.UserService;
import com.sz.mybatis.entity.MybatisUser;
import com.sz.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author a3575 on 2017-11-13 14:05:59
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    void setUserMapper(SqlSessionFactory factory){
        this.userMapper = factory.openSession().getMapper(UserMapper.class);
    }

    @Override
    public List<MybatisUser> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public MybatisUser getUser(String id) {
        return userMapper.getUser(id);
    }

    @Override
    public void addUser(MybatisUser user) {
        userMapper.addUser(user);
    }

}
