package com.learning.navigator.service;

import java.util.Collections;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiddenFeatureService {


    public String generateFact(int number) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://numbersapi.com/"+ number;
        String response = restTemplate.getForObject(url, String.class, Collections.emptyMap());
        if (response != null) {
            return response;
        } else {
            return "No fact available for number " + number;
        }
    }
    
}
