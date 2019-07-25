package com.gwj.gmall.user.service.impl;

import com.gwj.gmall.user.bean.UserInfo;
import com.gwj.gmall.user.mapper.UserInfoMapper;
import com.gwj.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gwj on 2019/7/24.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserInfoMapper userInfoMapper;


    @Override
    public UserInfo getUserById(long id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
