package com.shop.shop.Shop.service;

import com.shop.shop.Shop.model.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();
    ProductEntity getById(Long id);
}
