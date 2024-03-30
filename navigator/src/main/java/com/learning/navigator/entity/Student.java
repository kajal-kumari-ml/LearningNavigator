package com.learning.navigator.entity;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn; // Import the JoinColumn class

@Table(name = "student")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String registrationId;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(name = "student_subject",
               joinColumns = @JoinColumn(name = "student_id"), // Use JoinColumn annotation
               inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> enrolledSubjects;

    @ManyToMany(mappedBy = "enrolledStudents")
    private List<Exam> registeredExams;

    public Student(String registrationId, String name) {
        this.registrationId = registrationId;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", registrationId='" + registrationId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
