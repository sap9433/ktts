package com.infy.tesla.controllers;
import model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ktts")
public class RegistrationController {
    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user) {
        return user.getFname();
    }
}
