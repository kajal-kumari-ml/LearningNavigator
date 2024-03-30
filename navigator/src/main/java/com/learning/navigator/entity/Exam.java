package com.learning.navigator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.List;


@Table(name = "exam")
@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Subject subject;

    @ManyToMany
    @JoinTable(name = "student_exam",
               joinColumns = @JoinColumn(name = "id"),
               inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> enrolledStudents;
    
    public Exam() {
    }
    public Exam(Subject subject, List<Student> enrolledStudents) {
        this.subject = subject;
        this.enrolledStudents = enrolledStudents;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}

