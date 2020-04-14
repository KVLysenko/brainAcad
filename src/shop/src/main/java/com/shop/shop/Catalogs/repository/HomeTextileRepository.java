package com.shop.shop.Catalogs.repository;

import com.shop.shop.Catalogs.model.HomeTextileEntity;
import com.shop.shop.Shop.model.ProductEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HomeTextileRepository extends JpaRepository<HomeTextileEntity, Long> {

    Optional<HomeTextileEntity> findById(Long id);
    List<HomeTextileEntity> findAll();

    Optional<HomeTextileEntity> findByName(String name);

}
