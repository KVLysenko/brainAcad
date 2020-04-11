package com.shop.shop.Shop.repository;

import com.shop.shop.Shop.model.ProductEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @EntityGraph(value = "Graph.Product", type = EntityGraph.EntityGraphType.LOAD)
    List<ProductEntity> findAll();

    @EntityGraph(value = "Graph.Product", type = EntityGraph.EntityGraphType.LOAD)
    Optional<ProductEntity> findById(Long id);
}
