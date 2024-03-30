package com.learning.navigator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.navigator.repository.ExamRepository;

@Service
public class ExamService {

    @Autowired
    ExamRepository examRepository;

    
}
