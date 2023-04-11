package com.toyproject.first.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController
@Controller
@RequestMapping(value = "/")
public class commonController {
    @GetMapping(value = "")
    public String home(Model model){
        model.addAttribute("hello","Hello Thymeleaf Test");
        return "index";
    }
}
