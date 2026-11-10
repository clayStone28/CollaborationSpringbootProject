package com.project.Collab.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/multiplication")
public class MulController {

    @GetMapping("/{m1}/{m2}")
    public double multiplication(@PathVariable double m1, @PathVariable double m2)
    {
        return m1 * m2;
    }

    @GetMapping("/div/{num1}/{num2}")
    public double division(@PathVariable double num1, @PathVariable double num2)
    {
        return num1 / num2;
    }


}
