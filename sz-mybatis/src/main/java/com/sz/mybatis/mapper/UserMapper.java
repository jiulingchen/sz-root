package com.sz.mybatis.mapper;

import com.sz.mybatis.entity.MybatisUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author a3575 on 2017-11-13 12:53:38
 */
public interface UserMapper {

    @Select("SELECT * FROM user u")
    @Results(value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "user_name", property = "username"),
            @Result(column = "pass_word", property = "password")
    })
    List<MybatisUser> getUserList();

    @Select("SELECT * FROM user u WHERE u.id = #{id}")
    MybatisUser getUser(@Param("id")String id);

    @Insert("INSERT INTO user VALUES (#{id}, #{username}, #{password});")
    void addUser(@Param("id") Integer id,
                 @Param("username") String username,
                 @Param("password") String password);

}
