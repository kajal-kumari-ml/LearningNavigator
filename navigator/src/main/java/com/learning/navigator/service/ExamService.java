package com.learning.navigator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.navigator.entity.Exam;
import com.learning.navigator.repository.ExamRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExamService {

    @Autowired
    private ExamRepository examRepository;

    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }

    public Optional<Exam> getExamById(Long id) {
        return examRepository.findById(id);
    }

    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }

    public Exam updateExam(Long id, Exam examDetails) {
        Exam exam = getExamById(id).get();
        exam.setSubject(examDetails.getSubject());
        return examRepository.save(exam);
    }

    public void deleteExam(Long id) {
        Exam exam = getExamById(id).get();
        examRepository.delete(exam);
    }
}

