package com.gwj.gmall.user.controller;

import com.gwj.gmall.user.bean.UserAddress;
import com.gwj.gmall.user.bean.UserInfo;
import com.gwj.gmall.user.service.UserAddressService;
import com.gwj.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gwj on 2019/7/24.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserAddressService userAddressService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "success";
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public UserInfo getAllUser(long id){
        UserInfo userInfo = userService.getUserById(id);
        return userInfo;
    }

    @RequestMapping("/getAddressByUserId")
    @ResponseBody
    public UserAddress getAddressByUserId(long userId){
        UserAddress userAddress = userAddressService.getAddressByUserId(userId);
        return userAddress;
    }
}
