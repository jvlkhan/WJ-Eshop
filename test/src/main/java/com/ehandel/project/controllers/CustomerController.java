package com.ehandel.project.controllers;

import javax.validation.Valid;

import com.ehandel.project.entities.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class CustomerController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/paymentdone").setViewName("paymentdone");
    }

    @GetMapping("/test")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "test";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "test";
        }
        return "redirect:/paymentdone";
    }

    /*
     * @GetMapping("/cart") public String viewCart(Model model) { return "cart"; }
     */

    /*
     * @GetMapping("/paymentdone") public String viewPaymentdone(Model model) {
     * return "paymentdone"; }
     */
}
