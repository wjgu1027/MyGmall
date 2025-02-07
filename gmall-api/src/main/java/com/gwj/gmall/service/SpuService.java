package com.gwj.gmall.service;


import com.gwj.gmall.bean.PmsProductInfo;
import com.gwj.gmall.bean.PmsProductSaleAttr;
import com.gwj.gmall.bean.PmsProductSaleAttrValue;

import java.util.List;

public interface SpuService {

    List<PmsProductInfo> spuList(String catalog3Id);

    List<PmsProductSaleAttr> spuSaleAttr(String productId);

    List<PmsProductSaleAttrValue> spuSaleAttrValue(PmsProductSaleAttr pmsProductSaleAttr);

    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId, String skuId);
}
