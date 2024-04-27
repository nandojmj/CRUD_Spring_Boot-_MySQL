package com.example.crudrapido.controller;


import com.example.crudrapido.entity.Studend;
import com.example.crudrapido.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

//    private final StudentService studentService;
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }

    @GetMapping("/")
    public List<Studend> getAll(){
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")
    public Optional<Studend> getBId(@PathVariable("studentId") Long studentId){
        return studentService.getStudents(studentId);
    }


    @PostMapping
    public Studend saveOrUpdate(@RequestBody Studend student){
        studentService.saveOrUpdate(student);
        return student;
    }

//    @PostMapping
//    public void saveOrUpdate(@RequestBody Studend student){
//        studentService.saveOrUpdate(student);
//    }

    @DeleteMapping("/{studentId}")
    public void saveUpdate(@PathVariable ("studentId") Long studentId){
        studentService.delete(studentId);
    }
}
