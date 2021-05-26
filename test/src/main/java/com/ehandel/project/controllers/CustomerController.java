package com.ehandel.project.controllers;

import javax.validation.Valid;

import com.ehandel.project.entities.*;
import com.ehandel.project.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class CustomerController implements WebMvcConfigurer {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/paymentdone").setViewName("paymentdone");
    }

    @GetMapping("/checkout")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "checkout";
    }

    @PostMapping("/checkout")
    public String checkPersonInfo(@Valid Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "checkout";
        }
        customerRepository.save(customer);
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
