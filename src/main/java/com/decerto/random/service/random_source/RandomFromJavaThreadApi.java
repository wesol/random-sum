package com.decerto.random.service.random_source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile("javaApiSource")
class RandomFromJavaThreadApi implements RandomService {

    @Value("${org.random.min}")
    private int min;

    @Value("${org.random.max}")
    private int max;

    @Override
    public BigInteger getRandomInteger() {
       return BigInteger.valueOf(ThreadLocalRandom.current().nextInt(min, max + 1));
    }
}
