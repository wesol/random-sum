package com.decerto.random.service;


import com.decerto.random.service.join_operator.JoinerFacade;
import com.decerto.random.service.random_source.RandomService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class RandomNumberService {

    private final JoinerFacade joinerFacade;
    private final ApplicationContext applicationContext;


    private RandomNumberService(JoinerFacade joinerFacade, ApplicationContext applicationContext1) {
        this.joinerFacade = joinerFacade;
        this.applicationContext = applicationContext1;
    }

    public BigInteger generateIntegerRandom(){
        return joinerFacade.generateRandom(applicationContext.getBeansOfType(RandomService.class).values());
    }
}
