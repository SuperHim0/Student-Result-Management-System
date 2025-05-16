package com.srms.controller;

import com.srms.entity.Result;
import com.srms.entity.Student;
import com.srms.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/results")
public class ResultController {

    @Autowired
    private ResultService resultService;

    @PostMapping
    public ResponseEntity<Result> saveResult(@RequestBody Result result) {
        return ResponseEntity.ok(resultService.saveResult(result));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Result> getById(@PathVariable Long id) {
        return ResponseEntity.ok(resultService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteResult(@PathVariable Long id) {
        resultService.deleteResult(id);
        return ResponseEntity.ok("Result deleted successfully");
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<Result>> getResultsByStudent(@PathVariable Long studentId) {
        Student student = new Student(); // minimal student object with ID
        student.setId(studentId);
        return ResponseEntity.ok(resultService.getResultsByStudent(student));
    }
}
