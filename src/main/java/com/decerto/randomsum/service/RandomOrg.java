package com.decerto.randomsum.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.net.URI;
import java.util.logging.Logger;

@Service
public class RandomOrg implements RandomService {

    private final RestTemplate restTemplate;

    private final Logger logger = Logger.getLogger(getClass().getName());

    @Value("${org.random.url}")
    private String url;

    public RandomOrg(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public BigInteger getRandomInteger() {

        BigInteger random;
        try {
            random = restTemplate.getForObject(URI.create(url), BigInteger.class);
        } catch (RestClientException e) {
            logger.severe("Problem with random.org api, url: " + url + "\n" + e);
            throw e;
        }

        return random;
    }
}
