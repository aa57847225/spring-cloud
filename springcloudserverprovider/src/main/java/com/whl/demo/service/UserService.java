package com.whl.demo.service;

import com.whl.demo.mapper.UserMapper;
import com.whl.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        User user= userMapper.findUserInfo();
        //User user=null;
        return user;
    }

}
