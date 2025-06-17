package com.capstone.pizza_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public String greeting(){
        return "My back end app";
    }

}
