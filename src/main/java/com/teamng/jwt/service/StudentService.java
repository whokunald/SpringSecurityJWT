package com.teamng.jwt.service;

import com.teamng.jwt.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private static List<Student> studentList = List.of(
            new Student(1L, "Kunal", "Dinkar"),
            new Student(2L, "Omkar", "Rawool"),
            new Student(3L, "Aditya", "Mhatre"),
            new Student(4L, "Akshay", "Bhasal"),
            new Student(5L, "Vijeth", "Shetty"),
            new Student(6L, "Rohan", "C")
    );
    public Student getStudentById(Long studentId) {
        return studentList.stream().filter(student -> student.getStudentId() == studentId).findFirst().get();
    }
    public List<Student> getAllStudents() {
        return studentList;
    }
}
