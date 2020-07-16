package com.decerto.random.service.join_operator;

import com.decerto.random.service.random_source.RandomService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Collection;

@Service
class Joiner {

    BigInteger addUp(Collection<RandomService> values) {

       return values.stream()
                    .map(RandomService::getRandomInteger)
                    .reduce(new BigInteger("0"), BigInteger::add);
    }
}
