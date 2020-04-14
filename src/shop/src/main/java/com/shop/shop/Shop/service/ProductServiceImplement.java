package com.shop.shop.Shop.service;

import com.shop.shop.Catalogs.model.HomeTextileEntity;
import com.shop.shop.Shop.model.ProductEntity;
import com.shop.shop.Shop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImplement implements ProductService{
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<ProductEntity> getByHomeTextile(HomeTextileEntity homeTextileEntity) {
        return productRepository.findByHomeTextile(homeTextileEntity);
    }
}
