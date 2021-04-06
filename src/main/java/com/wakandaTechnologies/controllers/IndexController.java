package com.wakandaTechnologies.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    //The default page upon launch
    @GetMapping("/")
    public String showIndexPage() {

        return "index";
    }

    @GetMapping("/login")
    public String showLoginForm() {

        return "views/loginForm";
    }





}
