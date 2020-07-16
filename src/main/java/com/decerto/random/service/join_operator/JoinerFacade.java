package com.decerto.random.service.join_operator;

import com.decerto.random.service.random_source.RandomService;

import java.math.BigInteger;
import java.util.Collection;

public interface JoinerFacade {

    BigInteger generateRandom(Collection<RandomService> values);
}
