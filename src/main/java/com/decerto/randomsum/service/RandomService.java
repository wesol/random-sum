package com.decerto.randomsum.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;


@Service
public interface RandomService {

    BigInteger getRandomInteger();
}
