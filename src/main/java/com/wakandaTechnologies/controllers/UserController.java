package com.wakandaTechnologies.controllers;

import com.wakandaTechnologies.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //Filtering username from users
    @GetMapping("/users")
    public String listUsers(Model model, @RequestParam(defaultValue="")  String name) {
        model.addAttribute("users", userService.findByName(name));
        return "views/list";
    }

    //method to delete a task

    @GetMapping("/deleteUser")
    public String deleteUser(@PathVariable(value = "email")String email, Model model){
        return "redirect:/users";
    }


}
