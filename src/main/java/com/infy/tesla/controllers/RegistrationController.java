package com.infy.tesla.controllers;
import model.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ktts")
public class RegistrationController {
    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user) {
        // TODO Auto-generated method stub
        return "Kubra";
    }
}
