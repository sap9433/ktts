package com.infy.tesla.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Mapping(="/ktts")
public class RegistrationController {
    @GetMapping("/register")
    public String saveUser() {
        return "Greetings from Spring Boot!";
    }
}
