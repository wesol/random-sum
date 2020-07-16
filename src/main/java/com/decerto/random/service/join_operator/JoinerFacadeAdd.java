package com.decerto.random.service.join_operator;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigInteger;


@Service
@Profile("addition")
public class JoinerFacadeAdd implements JoinerFacade {

    private final Joiner joiner;

    private JoinerFacadeAdd(Joiner joiner) {
        this.joiner = joiner;
    }

    @Override
    public BigInteger generateRandom() {
        return joiner.addUp();
    }
}
