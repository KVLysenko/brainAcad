package com.shop.shop.Catalogs.service;

import com.shop.shop.Catalogs.model.HomeTextileEntity;
import com.shop.shop.Shop.model.ProductEntity;

import java.util.List;

public interface HomeTextileService {
   List<HomeTextileEntity> getAll();

    HomeTextileEntity getById(Long id);

    HomeTextileEntity getByName(String name);
}
