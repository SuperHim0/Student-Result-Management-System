package com.srms.services;

import com.srms.entity.Subjects;

import java.util.List;

public interface SubjectService {
    Subjects saveSubject(Subjects subject);
    void deleteSubject(Long id);
    Subjects getSubjectById(Long id);
    List<Subjects> getAllSubjects();
}
