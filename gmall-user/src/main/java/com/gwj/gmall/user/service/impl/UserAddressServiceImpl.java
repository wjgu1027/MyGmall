package com.gwj.gmall.user.service.impl;

import com.gwj.gmall.user.bean.UserAddress;
import com.gwj.gmall.user.mapper.UserAddressMapper;
import com.gwj.gmall.user.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gwj on 2019/7/25.
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    UserAddressMapper userAddressMapper;

    @Override
    public UserAddress getAddressByUserId(long userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.selectOne(userAddress);
    }
}
