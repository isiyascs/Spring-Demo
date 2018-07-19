package com.qburst.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Value("${messages.hello}")
    private String hello;

    @Autowired
    private CityService cityService;

    @RequestMapping("/")
    public String greeting(Model model){
        model.addAttribute("cities",cityService.findAll());
        return "home";
    }


}