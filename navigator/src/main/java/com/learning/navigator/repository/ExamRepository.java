package com.learning.navigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.navigator.entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long>{

    
}
