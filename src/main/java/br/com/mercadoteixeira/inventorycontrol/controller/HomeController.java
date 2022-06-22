package br.com.mercadoteixeira.inventorycontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //assing bean like controller
public class HomeController {
    
    @GetMapping("/") //this is a context, acessing root project
    public String home() {
        return "/home";
    }
}
