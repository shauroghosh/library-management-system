package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.Domain.Student;
import com.xfactor.openlibrary.repositories.StudentRepository;



@RestController
@RequestMapping("student")
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return student;
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @DeleteMapping("delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
    @GetMapping("findTotal")
    public Long findTotal() {
        return studentRepository.count();
    }
   
}
    



