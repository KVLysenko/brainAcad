package com.shop.shop.Security.service;

import com.shop.shop.Security.model.UserEntity;
import com.shop.shop.Security.repository.UserRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public List<UserEntity> getList(){
        return userRepository.findAll();
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    @Override
    public UserEntity findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }


}
