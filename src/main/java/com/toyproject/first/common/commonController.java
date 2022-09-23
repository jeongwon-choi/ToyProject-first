package com.toyproject.first.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class testContoller {
    @GetMapping(value = "")
    public String test(){
        return "Hellow VS code";
    }
}
