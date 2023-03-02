package com.teamng.jwt.controller;

import com.teamng.jwt.entity.Student;
import com.teamng.jwt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }

    @GetMapping("/students/{studentId}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<Student> getStudentById(@PathVariable Long studentId){
        return new ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
    }

    @GetMapping("/students")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
