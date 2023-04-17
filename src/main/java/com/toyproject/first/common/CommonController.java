package com.toyproject.first.common;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


//@RestController
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/")
public class CommonController {
    @GetMapping(value = "")
    public String home(Model model){
        model.addAttribute("hello","Hello Thymeleaf Test");
        return "index";
    }
}
