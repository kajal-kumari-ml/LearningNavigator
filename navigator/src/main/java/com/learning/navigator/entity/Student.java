package com.learning.navigator.entity;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name = "student")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToMany
    private List<Subject> enrolledSubjects;

    @ManyToMany
    private List<Exam> registeredExams;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(List<Subject> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    public void addEnrolledSubject(Subject subject) {
        if (enrolledSubjects == null) {
            enrolledSubjects = new ArrayList<>();
        }
        enrolledSubjects.add(subject);
    }

    public List<Exam> getRegisteredExams() {
        return registeredExams;
    }

    public void setRegisteredExams(List<Exam> registeredExams) {
        this.registeredExams = registeredExams;
    }

    public void addRegisteredExam(Exam exam) {
        if (registeredExams == null) {
            registeredExams = new ArrayList<>();
        }
        registeredExams.add(exam);
    }       

}
