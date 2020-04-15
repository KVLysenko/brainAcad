package com.shop.shop.Shop.rest;

import com.shop.shop.Catalogs.model.HomeTextileEntity;
import com.shop.shop.Catalogs.service.HomeTextileService;
import com.shop.shop.Shop.dto.ProductDto;
import com.shop.shop.Shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
@AllArgsConstructor
@Controller
public class ProductController {

    public ProductService productService;
    public HomeTextileService homeTextileService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("homeTextileList", homeTextileService.getAll());
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("products", ProductDto.productEntityListToDtoList(productService.getAll()));
        model.addAttribute("homeTextileList", homeTextileService.getAll());
        return "home";
    }

    @GetMapping("product/{id}")
    public String index(Model model, @PathVariable(name = "id") Long productId) {
        model.addAttribute("product", new ProductDto(productService.getById(productId)));
        model.addAttribute("homeTextileList", homeTextileService.getAll());
        return "productDetail";
    }

    @GetMapping("home-textile-id/{id}")
    public String getProductsByHomeTextileId(Model model, @PathVariable(name = "id") Long homeTextileId) {
        HomeTextileEntity homeTextileEntity = homeTextileService.getById(homeTextileId);
        model.addAttribute("products", ProductDto.productEntityListToDtoList(productService.getByHomeTextile(homeTextileEntity)));
        model.addAttribute("category", homeTextileEntity.getName());
        model.addAttribute("homeTextileList", homeTextileService.getAll());
        return "home";
    }

    @GetMapping("home-textile-name/{name}")
    public String getProductsByHomeTextileName(Model model, @PathVariable(name = "name") String name) {
        HomeTextileEntity homeTextileEntity = homeTextileService.getByName(name);
        model.addAttribute("products", ProductDto.productEntityListToDtoList(productService.getByHomeTextile(homeTextileEntity)));
        return "home";
    }
}
