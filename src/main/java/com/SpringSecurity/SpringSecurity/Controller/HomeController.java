package com.SpringSecurity.SpringSecurity.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }


    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/public")
    public String publicPage(){
        return "public"; //public -> public.html
    }
}
