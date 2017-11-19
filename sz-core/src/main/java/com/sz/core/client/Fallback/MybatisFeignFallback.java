package com.sz.core.client.Fallback;

import com.sz.core.client.MybatisFeign;
import org.springframework.stereotype.Component;

/**
 * @author a3575 on 2017-11-15 14:41:45
 */
@Component
public class MybatisFeignFallback implements MybatisFeign{
    @Override
    public String getUserList() {
        return "The Clent is not run.";
    }

    @Override
    public String getUser(String id) {
        return "The Clent is not run.";
    }

    @Override
    public String addUser(String username, String password) {
        return "The Clent is not run.";
    }

}
