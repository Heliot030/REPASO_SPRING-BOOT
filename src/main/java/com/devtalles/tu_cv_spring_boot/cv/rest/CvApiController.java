package com.devtalles.tu_cv_spring_boot.cv.rest;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //para el navegador JSON
public class CvApiController {

    @GetMapping("/cv")
    public Person getPerson(){
        return new Person("Leon ","Canto","Desarrolladoe JAVA T u papa");
    }
}
