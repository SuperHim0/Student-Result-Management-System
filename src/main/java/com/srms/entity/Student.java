package com.srms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String rollId;

    @ManyToOne
    private ClassEntity classEntity;

    private LocalDate dob;
    private String email;
    private String phone;
}
