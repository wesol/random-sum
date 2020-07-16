package com.decerto.random.service;


import com.decerto.random.service.join_operator.JoinerFacade;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class RandomNumberService {

    private final JoinerFacade joinerFacade;

    private RandomNumberService(JoinerFacade joinerFacade) {
        this.joinerFacade = joinerFacade;
    }

    public BigInteger generateIntegerRandom(){
        return joinerFacade.generateRandom();
    }
}
