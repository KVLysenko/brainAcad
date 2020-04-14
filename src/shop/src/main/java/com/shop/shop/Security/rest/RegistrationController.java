package com.shop.shop.Security.rest;

import com.shop.shop.Security.dto.LoginDto;
import com.shop.shop.Security.dto.UserRegistrationDto;
import com.shop.shop.Security.model.UserEntity;
import com.shop.shop.Security.repository.UserRepository;
import com.shop.shop.Security.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value = "/registration")
@AllArgsConstructor
public class RegistrationController {

    private UserRepository userRepository;
    private SecurityService securityService;
    private UserValidator userValidator;
    private final PasswordEncoder passwordEncoder;


    @GetMapping
    public String registration(Model model) {
        model.addAttribute("userEntity", new UserRegistrationDto());
        return "registration";
    }

    @PostMapping
    public String registration(@ModelAttribute("userEntity") UserRegistrationDto userEntity, BindingResult bindingResult, Model model) {

//        userValidator.validate(userEntity, bindingResult);
        Map validation = userValidator.myValidate(userEntity, model);
        if ((Boolean) validation.get("error")){
            model = (Model) validation.get("model");
            return "registration";
        }

        UserEntity newUser = new UserEntity();
        newUser.setEmail(userEntity.getEmail());
        newUser.setPassword(passwordEncoder.encode(userEntity.getPassword()));

        userRepository.save(newUser);
        model.addAttribute("userLogin", new LoginDto());
        return "login";
    }

}
