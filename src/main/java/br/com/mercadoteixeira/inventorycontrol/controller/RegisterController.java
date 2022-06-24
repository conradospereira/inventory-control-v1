package br.com.mercadoteixeira.inventorycontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class RegisterController {

    @GetMapping("/registration")
    public String registration() {
        return "/products/registration";
    }

    @GetMapping("/list")
    public String list() {
        return "/products/list";
    }

}
