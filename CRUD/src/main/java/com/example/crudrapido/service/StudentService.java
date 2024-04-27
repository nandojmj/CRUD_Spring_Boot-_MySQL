package com.example.crudrapido.service;

import com.example.crudrapido.entity.Studend;
import com.example.crudrapido.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Studend> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Studend> getStudents(Long id){
        return studentRepository.findById(id);
    }

    public void saveOrUpdate(Studend studend){
        studentRepository.save(studend);

    } public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
