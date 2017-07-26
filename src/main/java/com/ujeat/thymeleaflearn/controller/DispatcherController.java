package com.ujeat.thymeleaflearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DispatcherController {
    @GetMapping("/index")
    public String index(){
        return "/index";
    }
    @GetMapping("/footer")
    public String footer(){
        return "/footer";
    }
}
