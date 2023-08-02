package com.example.studentapp.controller;

import com.example.studentapp.dto.StudentRequest;
import com.example.studentapp.entity.Student;

import com.example.studentapp.exception.StudentNotFoundException;
import com.example.studentapp.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("all")
    public ResponseEntity<List<Student>> getAllStudents()
    {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable int studentId) throws StudentNotFoundException {
        return new ResponseEntity<>(studentService.getStudent(studentId),HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody @Valid StudentRequest studentRequest)
    {
        return new ResponseEntity<Student>(studentService.addStudent(studentRequest), HttpStatus.CREATED);
    }

}
