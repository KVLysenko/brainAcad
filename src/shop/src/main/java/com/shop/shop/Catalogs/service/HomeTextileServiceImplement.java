package com.shop.shop.Catalogs.service;

import com.shop.shop.Catalogs.model.HomeTextileEntity;
import com.shop.shop.Catalogs.repository.HomeTextileRepository;
import com.shop.shop.Shop.model.ProductEntity;
import com.shop.shop.Shop.repository.ProductRepository;
import com.shop.shop.Shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HomeTextileServiceImplement implements HomeTextileService{
    private HomeTextileRepository homeTextileRepository;

    @Override
    public List<HomeTextileEntity> getAll() {
        return homeTextileRepository.findAll();
    }

    @Override
    public HomeTextileEntity getById(Long id) {
        return homeTextileRepository.findById(id).orElse(null);
    }

    @Override
    public HomeTextileEntity getByName(String name) {
        return homeTextileRepository.findByName(name).orElse(null);
    }
}
