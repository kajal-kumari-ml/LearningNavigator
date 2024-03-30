package com.learning.navigator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.navigator.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
    
}
