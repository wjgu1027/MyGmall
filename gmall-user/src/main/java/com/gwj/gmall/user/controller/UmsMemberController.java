package com.gwj.gmall.user.controller;

import com.gwj.gmall.bean.UmsMember;
import com.gwj.gmall.bean.UmsMemberReceiveAddress;
import com.gwj.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by gwj on 2019/7/24.
 */
@Controller
public class UmsMemberController {
    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "success";
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public UmsMember getUmsMemberById(String id){
        UmsMember umsMember = userService.getUmsMemberById(id);
        return umsMember;
    }

    @RequestMapping("/getAddressByUserId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getAddressByUserId(String userId){
        List<UmsMemberReceiveAddress> addressList = userService.getReceiveAddressByMemberId(userId);
        return addressList;
    }
}
