package com.shop.shop.Security.rest;

import com.shop.shop.Security.dto.LoginDto;
import com.shop.shop.Security.model.UserEntity;
import com.shop.shop.Security.repository.UserRepository;
import com.shop.shop.Security.service.SecurityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
@AllArgsConstructor
public class AuthController {

    private UserRepository userRepository;


    @GetMapping
    public String login(Model model) {
        model.addAttribute("userLogin", new LoginDto());
        return "login";
    }

    @PostMapping
    public String logIn(Model model, @ModelAttribute("userLogin") LoginDto userLogin) {
        UserEntity user = userRepository.findByEmail(userLogin.getEmail()).orElse(null);
        if (user == null){
            model.addAttribute("userLogin", userLogin);
            return "login";
        }
        if (userLogin.getPassword().equals(user.getPassword())) {
            userLogin.setPassword("");
            model.addAttribute("userLogin", userLogin);
            return "login";
        }
        return "login";
    }


}
