package com.decerto.randomsum.controller;


import com.decerto.randomsum.service.RandomService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("/calculator")
public class SumController {

    private final RandomService randomService;

    @Value("${org.random.min}")
    private int min;

    @Value("${org.random.max}")
    private int max;

    private SumController(RandomService randomService) {
        this.randomService = randomService;
    }

    @GetMapping("/random-sum")
    private String countRandom() {

        BigInteger firstRandom = BigInteger.valueOf(ThreadLocalRandom.current().nextInt(min, max + 1));
        BigInteger secondRandom = randomService.getRandomInteger();
        BigInteger sum = firstRandom.add(secondRandom);

        return " " + firstRandom + " + " + secondRandom + " = " + sum;
    }
}
