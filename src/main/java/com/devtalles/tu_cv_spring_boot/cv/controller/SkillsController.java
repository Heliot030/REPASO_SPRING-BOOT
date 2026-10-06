package com.devtalles.tu_cv_spring_boot.cv.controller;

import com.devtalles.tu_cv_spring_boot.cv.model.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/skills")
public class SkillsController {

    private final List<Skill>  skills = new ArrayList<>();

    @GetMapping
    public String showskill(Model model){
        model.addAttribute("skills",skills);
        return "skills";
    }

    //Craga dedsde el dformulario
    @GetMapping("/new")
    public String showForm(Model model){
        model.addAttribute("skill", new Skill());
        return "add-skill";
    }

    //recibe con ModelAtribute lo del formulario
    @PostMapping("/add")
    public String addSkill(@ModelAttribute Skill skill){
        skills.add(skill);
        return "redirect:/skills";
    }

}
