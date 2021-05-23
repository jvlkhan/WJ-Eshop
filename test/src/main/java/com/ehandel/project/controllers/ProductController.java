package com.lektiontest.test.controllers;

import java.util.List;

import com.lektiontest.test.entities.Products;
import com.lektiontest.test.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class ProductController implements WebMvcConfigurer {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Products> products = productRepository.findTop9ByOrderByProductnameAsc();
        // List<Products> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/new")
    public String showNewProductPage(Model model) {
        Products product = new Products();
        model.addAttribute("product", product);
        return "new-product";
    }

    @PostMapping(value = "/save")
    public String saveProduct(@ModelAttribute("product") Products product) {
        productRepository.save(product);
        return "redirect:/";
    }

    @GetMapping("/aboutus")
    public String viewAboutus(Model model) {
        return "aboutus";
    }

    @GetMapping("/cart")
    public String viewCart(Model model) {
        return "cart";
    }

    @GetMapping("/checkout")
    public String viewCheckout(Model model) {
        return "checkout";
    }

    @GetMapping("/paymentdone")
    public String viewPaymentdone(Model model) {
        return "paymentdone";
    }
}
