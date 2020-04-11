package com.shop.shop.Shop.rest;

import com.shop.shop.Shop.dto.ProductDto;
import com.shop.shop.Shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
@AllArgsConstructor
@Controller
public class ProductController {

    public ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", ProductDto.productEntityListToDtoList(productService.getAll()));
        return "index";
    }

}
