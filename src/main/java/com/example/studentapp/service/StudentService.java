package com.example.studentapp.service;

import com.example.studentapp.dto.StudentRequest;
import com.example.studentapp.entity.Student;
import com.example.studentapp.exception.StudentNotFoundException;
import com.example.studentapp.repository.StudentRepository;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }

    public Student getStudent(int studentId) throws StudentNotFoundException {
        Student student = studentRepository.findByStudentId(studentId);
        if(student != null)
        {
            return student;
        }
        else {
            throw new StudentNotFoundException("Student Not Exists in the DataBase : "+studentId);
        }
    }

    public Student addStudent(StudentRequest studentRequest)
    {
        Student student = Student.bind(0,studentRequest.getStudentName(),studentRequest.getAddress());
        return studentRepository.save(student);
    }
}
