package com.udacity.jwdnd.course1.cloudstorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/home")

    @GetMapping
    public String home(Model model) {
        return "home";
    }

    @RequestMapping("/login")

    @GetMapping
    public String login(Model model) {
        return "login";
    }

    @RequestMapping("/signup")

    @GetMapping
    public String signup(Model model) {
        return "signup";
    }

    @PostMapping
    public String signupPost(Model model) {
        return "login";
    }
}