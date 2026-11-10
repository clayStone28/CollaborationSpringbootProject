package com.project.Collab.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addition")
public class AddController {

    @GetMapping("/addition/{num1}/{num2}")
    public double Addition(@PathVariable double num1, @PathVariable double num2){

        return num1 + num2;
    }

}
