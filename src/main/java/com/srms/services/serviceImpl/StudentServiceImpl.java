package com.srms.services.serviceImpl;

import com.srms.entity.Student;
import com.srms.repository.StudentRepository;
import com.srms.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        if (!student.getRollId().isEmpty()){
            repository.findByRollId(student.getRollId()).orElseThrow(() -> new RuntimeException("ROLL ID ALREADY EXIST "));
        }
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Student getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Student getByRollId(String rollId) {
        return repository.findByRollId(rollId).orElseThrow();
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findByRollId(String rollNumber) {
        return repository.findByRollId(rollNumber).orElseThrow();
    }
}
