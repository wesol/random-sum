package com.decerto.random.service.join_operator;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.logging.Logger;


@Service
public class JoinerFacade {

    private final Logger logger = Logger.getLogger(getClass().getName());

    private final Joiner joiner;

    @Value("{service.joinManner}")
    private String joinManner;

    public JoinerFacade(Joiner joiner) {
        this.joiner = joiner;
    }

    public BigInteger generateRandom() {

        BigInteger random;

        switch (joinManner) {
            case "DODAWANIE":
                random = joiner.addUp();
                break;
            default:
                String message = String.format("Method \"%s\" not supported!", joinManner);
                logger.severe(message);
                throw new UnsupportedOperationException(message);
        }

        return random;
    }
}
