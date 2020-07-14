package com.decerto.random.service.join_operator;

import com.decerto.random.service.random_source.RandomService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
class Joiner {

    private RandomService randomOrg;
    private RandomService randomThreadApi;

    private Joiner(@Qualifier("randomOrg")RandomService randomOrg,
                  @Qualifier("randomFromJavaThreadApi") RandomService randomThreadApi) {

        this.randomOrg = randomOrg;
        this.randomThreadApi = randomThreadApi;
    }

    BigInteger addUp() {

        return null;
    }
}
