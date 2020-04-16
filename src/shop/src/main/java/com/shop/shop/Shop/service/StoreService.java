//package com.shop.shop.Shop.service;
//
//import com.shop.shop.Shop.model.ProductEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class StoreService {
//    private Map<ProductEntity, Integer> products = new LinkedHashMap<>();
//
//    public static ProductEntity getProductById(Long id) {
//        return getProductById(id);
//    }
//
//    public ProductEntity getAll() {
//        return productRepository.findAll();
//    }
//
//    @Transactional
//    public void addProductToBasket(ProductEntity product, int count) {
//        products.put(product, count);
//    }
//}