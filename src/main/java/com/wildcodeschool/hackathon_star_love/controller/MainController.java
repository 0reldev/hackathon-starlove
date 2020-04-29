package com.wildcodeschool.hackathon_star_love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/result")
    public String showResult() {
        return "result";
    }

}


