package com.het.boot.dao;

import com.het.boot.dao.aspect.SetDomain;
import com.het.boot.dao.entity.ProductDO;

import java.util.Map;

public interface ProductMapper {

    int insert(ProductDO record);

    @SetDomain
    ProductDO getById(Map<String, Object> params);
}