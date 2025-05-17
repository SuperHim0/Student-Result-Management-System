package com.srms.services.serviceImpl;

import com.srms.entity.Student;
import com.srms.repository.StudentRepository;
import com.srms.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        Optional<Student> byRollId = repository.findByRollId(student.getRollId());
        if (byRollId.isPresent()){
            throw  new RuntimeException("ROLL_ID ALREADY EXIST");
        }
        return repository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        Student student1 = repository.findById(student.getId()).orElseThrow();
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setDob(student.getDob());
        student1.setPhone(student.getPhone());
        student1.setClassEntity(student.getClassEntity());
        return  repository.save(student1);
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
