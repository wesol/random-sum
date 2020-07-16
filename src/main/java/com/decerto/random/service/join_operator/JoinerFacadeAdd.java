package com.decerto.random.service.join_operator;


import com.decerto.random.service.random_source.RandomService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Collection;


@Service
@Profile("addition")
public class JoinerFacadeAdd implements JoinerFacade {

    private final Joiner joiner;

    private JoinerFacadeAdd(Joiner joiner) {
        this.joiner = joiner;
    }

    @Override
    public BigInteger generateRandom(Collection<RandomService> values) {
        return joiner.addUp(values);
    }
}
