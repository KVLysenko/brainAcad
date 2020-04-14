package com.shop.shop.Security.rest;

import com.shop.shop.Security.dto.UserRegistrationDto;
import com.shop.shop.Security.model.UserEntity;
import com.shop.shop.Security.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import java.util.HashMap;
import java.util.Map;

@Component
@AllArgsConstructor
public class UserValidator {
    private UserRepository userRepository;

    public void validate(Object o, Errors errors) {
        UserRegistrationDto user = (UserRegistrationDto) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
        if (user.getEmail().length() < 6 || user.getEmail().length() > 32) {
            errors.rejectValue("emailSize", "Size.userForm.userName");
        }
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            errors.rejectValue("emailDuplicate", ".userForm.userName");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 3 || user.getEmail().length() > 32) {
            System.out.println("Пароль короткий");
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!user.getConfirmPassword().equals(user.getPassword())) {
            errors.rejectValue("confirmPassword", "Diff.userForm.passwordConfirm");
        }
    }

    public Map myValidate(UserRegistrationDto user, Model model) {
        Map<Object, Object> temp = new HashMap<>();
        temp.put("error", false);
        if(!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("notMatchPassword", "Пароли не совпадают");
            temp.put("error", true);
        }

        if(userRepository.findByEmail(user.getEmail()).isPresent()) {
            model.addAttribute("emailAlreadyExist", "Такая почта уже используется");
            temp.put("error", true);
        }
        temp.put("model", model);
        return temp;

    }
}
