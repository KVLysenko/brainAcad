package com.shop.shop.Security.repository;

import com.shop.shop.Security.model.UserEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @EntityGraph(value = "Graph.User", type = EntityGraph.EntityGraphType.LOAD)
    Optional<UserEntity> findByEmail(String email);

}
