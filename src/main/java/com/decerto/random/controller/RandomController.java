package com.decerto.random.controller;


import com.decerto.random.service.RandomNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/randoms")
public class RandomController {

    private final RandomNumberService randomNumberService;

    private RandomController(RandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    @GetMapping("/random")
    private BigInteger getRandom() {

        return randomNumberService.generateIntegerRandom();
    }
}
