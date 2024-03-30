package com.learning.navigator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.navigator.service.HiddenFeatureService;

@RestController
@RequestMapping("/hidden")
public class HiddenFeatureController {

    @Autowired
    HiddenFeatureService hiddenFeatureService;

    @GetMapping("/feature/{number}")
    public String getHiddenFeature(@PathVariable int number) {
       return hiddenFeatureService.generateFact(number);
    }
    
}
