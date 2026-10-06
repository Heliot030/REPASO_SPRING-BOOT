package com.devtalles.tu_cv_spring_boot.cv.controller;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv") //ruta base
public class CvController {

    @GetMapping({"/home"})
    public String index(Model model){
        Person person = new Person("Leon","Canto","DevOps");
        model.addAttribute("name","EE");
        model.addAttribute("persona",person);
        return "index";
    }


}
