package com.decerto.randomsum.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class SumController {

    @GetMapping("/random-sum")
    public String countRandom(Model model) {

        return "random-sum";
    }
}
