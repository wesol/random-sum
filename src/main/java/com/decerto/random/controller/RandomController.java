package com.decerto.random.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class RandomController {

    @GetMapping("/random-sum")
    private String countRandom() {

        return null;
    }
}
