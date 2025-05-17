package com.srms.services;

import com.srms.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
    Student getById(Long id);
    Student getByRollId(String rollId);
    List<Student> getAllStudents();

    Student findByRollId(String rollNumber);
}
