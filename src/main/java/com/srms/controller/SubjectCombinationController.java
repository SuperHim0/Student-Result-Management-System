package com.srms.controller;

import com.srms.entity.SubjectCombination;
import com.srms.services.SubjectCombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/subject-combinations")
public class SubjectCombinationController {

    @Autowired
    private SubjectCombinationService subjectCombinationService;

    @PostMapping
    public ResponseEntity<SubjectCombination> createCombination(@RequestBody SubjectCombination combination) {
        return ResponseEntity.ok(subjectCombinationService.saveCombination(combination));
    }

    @GetMapping
    public List<SubjectCombination> getAllCombinations() {
        return subjectCombinationService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubjectCombination> getById(@PathVariable Long id) {
        return ResponseEntity.ok(subjectCombinationService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCombination(@PathVariable Long id) {
        subjectCombinationService.deleteCombination(id);
        return ResponseEntity.ok("Combination deleted successfully");
    }
}
