package com.project.Collab.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colab")
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from the Collaboration Controller!";
    }

}
