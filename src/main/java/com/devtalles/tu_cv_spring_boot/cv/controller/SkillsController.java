package com.devtalles.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SkillsController {

    @GetMapping("/skills")
    public String skills(Model model){
        List<String> skills = List.of("Java","C#","JavaScript","CSS"
                                    ,"HTML","SQL");

        List<String> listVacia = new ArrayList<>();
        model.addAttribute("skills",listVacia);
        return "skills";
    }
}
