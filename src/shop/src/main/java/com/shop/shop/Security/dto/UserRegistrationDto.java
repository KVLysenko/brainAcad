package com.shop.shop.Security.dto;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String email;
    private String password;
    private String confirmPassword;
}
