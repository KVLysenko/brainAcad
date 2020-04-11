package com.shop.shop.Security.rest;

import com.shop.shop.Security.dto.UserRegistrationDto;
import com.shop.shop.Security.model.UserEntity;
import com.shop.shop.Security.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Component
@AllArgsConstructor
public class UserValidator {
    private UserRepository userRepository;

    public void validate(Object o, Errors errors) {
        UserRegistrationDto user = (UserRegistrationDto) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
        if (user.getEmail().length() < 6 || user.getEmail().length() > 32) {
            errors.rejectValue("email", "Size.userForm.userName");
        }
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            errors.rejectValue("email", "Duplicate.userForm.userName");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 3 || user.getEmail().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }
        if (!user.getConfirmPassword().equals(user.getPassword())) {
            errors.rejectValue("confirmPassword", "Diff.userForm.passwordConfirm");
        }
    }
}
