package com.wildcodeschool.hackathon_star_love.controller;

import com.wildcodeschool.hackathon_star_love.entity.People;
import com.wildcodeschool.hackathon_star_love.repository.PeopleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JDBCController {

    private PeopleRepository repository = new PeopleRepository();

    @GetMapping("/peopleList")
    @ResponseBody
    public List<People>  getFindLoveGlobal() {

        return repository.findLoveGlobal();
    }


}
