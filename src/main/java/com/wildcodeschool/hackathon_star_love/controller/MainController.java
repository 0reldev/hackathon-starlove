package com.wildcodeschool.hackathon_star_love.controller;

import com.wildcodeschool.hackathon_star_love.entity.People;
import com.wildcodeschool.hackathon_star_love.repository.PeopleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private PeopleRepository repository = new PeopleRepository();

    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/result")
    public String showResult(Model out) {


        People people = repository.findLoveGlobal();
        out.addAttribute("people", people);

        return "result";
    }



}


