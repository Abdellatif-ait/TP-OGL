package com.telly.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class userController {
    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }
    @RequestMapping("/loggedout")
    public String showLogout() {
        return "loggedout";
    }
}
