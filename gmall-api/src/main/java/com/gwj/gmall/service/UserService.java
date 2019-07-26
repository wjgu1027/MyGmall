package com.gwj.gmall.service;

import com.gwj.gmall.bean.UmsMember;
import com.gwj.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    UmsMember getUmsMemberById(String id);

    void addUmsMember(UmsMember umsMember);

    void deletUmsMemberById(String Id);

    void updataUmsMember(UmsMember umsMember);

    void addUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress);

    void deletUmsMemberReceiveAddressById(String Id);

    void updataUmsMemberReceiveAddress(UmsMemberReceiveAddress umsMemberReceiveAddress1);

    UmsMember login(UmsMember umsMember);

    void addUserToken(String token, String memberId);

    UmsMember addOauthUser(UmsMember umsMember);

    UmsMember checkOauthUser(UmsMember umsCheck);

    String getSourceType(String memberId);

    UmsMemberReceiveAddress getReceiveAddressByReceiveAddressId(String receiveAddressId);
}
