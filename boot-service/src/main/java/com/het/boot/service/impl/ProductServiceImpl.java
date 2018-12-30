package com.het.boot.service.impl;

import com.het.boot.dao.ProductMapper;
import com.het.boot.dao.entity.ProductDO;
import com.het.boot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductDO getById(long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return productMapper.getById(params);
    }
}
