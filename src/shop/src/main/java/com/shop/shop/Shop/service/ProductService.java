package com.shop.shop.Shop.service;

import com.shop.shop.Catalogs.model.HomeTextileEntity;
import com.shop.shop.Shop.model.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();
    ProductEntity getById(Long id);
    List<ProductEntity> getByHomeTextile(HomeTextileEntity homeTextileEntity);
}
