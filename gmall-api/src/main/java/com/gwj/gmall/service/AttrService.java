package com.gwj.gmall.service;


import com.gwj.gmall.bean.PmsBaseAttrInfo;
import com.gwj.gmall.bean.PmsBaseAttrValue;

import java.util.List;
import java.util.Set;

public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String Catalog3Id);

    List<PmsBaseAttrValue> attrValueList(String attrId);

    void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> valueIdSet);

}
