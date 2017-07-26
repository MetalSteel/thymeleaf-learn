package com.ujeat.thymeleaflearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DispatcherController {
    @GetMapping("/{view}")
    public String index(@PathVariable("view")String view){
        return "/"+view;
    }
}
