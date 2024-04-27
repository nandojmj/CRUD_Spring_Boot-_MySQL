package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_student")
public class Studend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name="email address",unique = true,nullable = false)
    private String email;


}
