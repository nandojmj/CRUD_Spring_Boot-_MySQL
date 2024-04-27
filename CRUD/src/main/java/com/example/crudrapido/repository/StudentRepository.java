package com.example.crudrapido.repository;

import com.example.crudrapido.entity.Studend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Studend, Long> {
}
