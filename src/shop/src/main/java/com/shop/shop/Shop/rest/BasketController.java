//package com.shop.shop.Shop.rest;
//
//        import com.shop.shop.Shop.model.ProductEntity;
//        import com.shop.shop.Shop.service.StoreService;
//        import org.springframework.stereotype.Controller;
//        import org.springframework.ui.Model;
//        import org.springframework.web.bind.annotation.PathVariable;
//        import org.springframework.web.bind.annotation.RequestMapping;
//        import org.springframework.web.bind.annotation.RequestMethod;
//
//@RequestMapping(value="/addProduct/{id}",method = RequestMethod.GET)
//@Controller
//public class BasketController {
//    StoreService storeService;
//
//    public String addProduct(@PathVariable(name = "id") Long id){
//        ProductEntity product = storeService.getProductById(id);
//        storeService.addProductToBasket(product, 1);
//        return "redirect:/";
//    }
//    @RequestMapping(value = "/")
//    public String index(Model model, Model mode1) {
//        model.addAttribute("products",storeService.getAll());
//        mode1.addAttribute("productInBasket", storeService.getBasket());
//        return "index";
//    }
//}
