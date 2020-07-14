package com.decerto.random.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;


@Service
public interface RandomService {

    BigInteger getRandomInteger();
}
