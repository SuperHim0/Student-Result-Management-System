package com.srms.services.serviceImpl;

import com.srms.entity.Result;
import com.srms.entity.Student;
import com.srms.repository.ResultRepository;
import com.srms.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private ResultRepository resultRepository;

    @Override
    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    @Override
    public void deleteResult(Long id) {
        resultRepository.deleteById(id);
    }

    @Override
    public Result getById(Long id) {
        return resultRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Result> getResultsByStudent(Student student) {
        return resultRepository.findByStudent(student);
    }

    @Override
    public Object findByStudent(Student student) {
        return resultRepository.findByStudent(student);
    }
}

