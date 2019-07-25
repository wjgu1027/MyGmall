package com.gwj.gmall.user.service;

import com.gwj.gmall.user.bean.UserAddress;

/**
 * Created by gwj on 2019/7/25.
 */
public interface UserAddressService {
    UserAddress getAddressByUserId(long userId);
}
