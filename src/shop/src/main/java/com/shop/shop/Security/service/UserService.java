package com.shop.shop.Security.service;

import com.shop.shop.Security.model.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getList();
    UserEntity findByEmail(String email);
    UserEntity findById(Long id);
    UserEntity save(UserEntity user);
}
