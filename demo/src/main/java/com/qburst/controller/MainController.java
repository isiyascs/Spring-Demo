package com.qburst.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @Value("${messages.hello}")
    private String hello;

    /*@Value("${messages.bye}")
    private String bye;
*/
    @RequestMapping("/")
    public String greeting(Model model){
        model.addAttribute("msg",hello);
        return "home";
    }


}