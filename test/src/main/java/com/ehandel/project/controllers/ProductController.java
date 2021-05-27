package com.ehandel.project.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ehandel.project.entities.*;
import com.ehandel.project.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@SessionAttributes("cart")
public class ProductController implements WebMvcConfigurer {

    @Autowired
    private ProductRepository productRepository;

    public List<Long> incart = new ArrayList<Long>();
    public List<Products> incartProducts = new ArrayList<Products>();

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Products> products = productRepository.findTop9ByOrderByProductnameAsc();
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
        model.addAttribute("temp", temp);
        return "cart";
    }

    @ModelAttribute("cart")
    public Set<Products> initCart() {
        return new HashSet<>();
    }

    long temp;

    @PostMapping("/addToCart/{productcode}")
    public String addToCart(@PathVariable(name = "productcode") String id, @ModelAttribute("cart") Set<Products> cart,
            Model model) {
        Products product = productRepository.findById(id).get();
        incart = new ArrayList<Long>();

        boolean isItemPresent = cart.stream().anyMatch(item -> item.getProductcode() == product.getProductcode());
        if (!isItemPresent) {
            cart.add(product);
            incartProducts.add(product);
            incart.add(product.getMsrp());
            for (int i = 0; i < incart.size(); i++) {
                temp += incart.get(i);
            }
        }

        model.addAttribute("cart", cart);
        model.addAttribute("temp", temp);
        return "redirect:/";
    }

    @GetMapping("/detail/{productcode}")
    public ModelAndView showEditProductPagee(@PathVariable(name = "productcode") String id) {
        ModelAndView modelAndView = new ModelAndView("detailProduct");
        Products product = productRepository.findById(id).get();
        modelAndView.addObject("products", product);
        return modelAndView;
    }

    /*
     * @GetMapping("/checkout") public String viewCheckout(Model model) { return
     * "checkout"; }
     */

    /*
     * @GetMapping("/paymentdone") public String viewPaymentdone(Model model) {
     * return "paymentdone"; }
     */
}
