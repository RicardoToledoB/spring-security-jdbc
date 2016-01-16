package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("homeController")
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "/home";
    }
    @RequestMapping("/")
    public String root(){
        return "/home";
    }
}
