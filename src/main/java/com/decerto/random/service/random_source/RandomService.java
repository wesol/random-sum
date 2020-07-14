package com.decerto.random.service.random_source;

import org.springframework.stereotype.Service;

import java.math.BigInteger;


@Service
public interface RandomService {

    BigInteger getRandomInteger();
}
