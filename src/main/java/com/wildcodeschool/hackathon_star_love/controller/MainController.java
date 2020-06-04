package com.wildcodeschool.hackathon_star_love.controller;

import com.wildcodeschool.hackathon_star_love.entity.People;
import com.wildcodeschool.hackathon_star_love.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private PeopleRepository repository;

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

    @GetMapping("/result-bis")
    public String showPeople(Model out, @RequestParam String planetName) {

        People people = repository.findLovePlanet(planetName);
        out.addAttribute("people", people);

        return "result";
    }

    @GetMapping("/result-3")
    public String showPeopleChoice(Model out, @RequestParam (required = false) String planetName,
                                   @RequestParam (required = false) String gender, @RequestParam (required = false) String eyeColor, @RequestParam (required = false) String hairColor) {

        People people = repository.findLoveChoice(planetName, gender, eyeColor, hairColor);
        out.addAttribute("people", people);

        return "result";
    }


}


