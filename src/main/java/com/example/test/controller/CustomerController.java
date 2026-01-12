package com.example.test.controller;

import com.example.test.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class CustomerController {
    private final CustomerRepository customerRepository;

    // Get List of Customers
    @GetMapping("/")
    public String getCustomer(Model model){
        model.addAttribute("customers",customerRepository.findAll());
        return "customers";
    }
}
