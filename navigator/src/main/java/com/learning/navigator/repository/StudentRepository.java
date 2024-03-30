package com.learning.navigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.navigator.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    
}