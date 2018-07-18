package com.qburst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String greeting(){
        return "hello";
    }
    @RequestMapping("/page")
    public String greeting1(){
        return "siya";
    }
}