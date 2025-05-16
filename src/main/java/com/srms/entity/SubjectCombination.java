package com.srms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SubjectCombination {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private ClassEntity classEntity;

    @ManyToOne
    private Subjects subject;

    private boolean active;
}
