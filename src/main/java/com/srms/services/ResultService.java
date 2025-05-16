package com.srms.services;

import com.srms.entity.Result;
import com.srms.entity.Student;

import java.util.List;

public interface ResultService {
    Result saveResult(Result result);
    void deleteResult(Long id);
    Result getById(Long id);
    List<Result> getResultsByStudent(Student student);

    Object findByStudent(Student student);
}
