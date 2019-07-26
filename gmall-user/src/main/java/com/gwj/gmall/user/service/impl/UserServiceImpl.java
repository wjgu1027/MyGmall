package com.gwj.gmall.user.service.impl;

import com.gwj.gmall.bean.UmsMember;
import com.gwj.gmall.bean.UmsMemberReceiveAddress;
import com.gwj.gmall.service.UserService;
import com.gwj.gmall.user.mapper.UmsMemberMapper;
import com.gwj.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gwj on 2019/7/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UmsMemberMapper umsMemberMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }

    @Override
    public UmsMember getUmsMemberById(String id) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(id);
        return umsMemberMapper.selectOne(umsMember);
    }

    @Override
    public void addUmsMember(UmsMember umsMember) {

    }

    @Override
    public void deletUmsMemberById(String Id) {

    }

    @Override
    public void updataUmsMember(UmsMember umsMember) {

    }

    @Override
    public void addUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress) {

    }

    @Override
    public void deletUmsMemberReceiveAddressById(String Id) {

    }

    @Override
    public void updataUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress1) {

    }

    @Override
    public UmsMember login(UmsMember umsMember) {
        return null;
    }

    @Override
    public void addUserToken(String token, String memberId) {

    }

    @Override
    public UmsMember addOauthUser(UmsMember umsMember) {
        return null;
    }

    @Override
    public UmsMember checkOauthUser(UmsMember umsCheck) {
        return null;
    }

    @Override
    public String getSourceType(String memberId) {
        return null;
    }

    @Override
    public UmsMemberReceiveAddress getReceiveAddressByReceiveAddressId(String receiveAddressId) {
        return null;
    }
}
