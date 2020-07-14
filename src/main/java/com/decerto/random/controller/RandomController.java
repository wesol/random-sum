package com.decerto.random.controller;


import com.decerto.random.service.join_operator.JoinerFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/randoms")
public class RandomController {

    private final JoinerFacade joinerFacade;

    public RandomController(JoinerFacade joinerFacade) {
        this.joinerFacade = joinerFacade;
    }

    @GetMapping("/random")
    private BigInteger countRandom() {

        return joinerFacade.generateRandom();
    }
}
