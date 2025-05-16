package com.srms.controller;

import com.srms.entity.ClassEntity;
import com.srms.services.ClassEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/classes")
public class ClassEntityController {

    @Autowired
    private ClassEntityService classService;

    @PostMapping
    public ResponseEntity<ClassEntity> addClass(@RequestBody ClassEntity classEntity) {
        return ResponseEntity.ok(classService.saveClass(classEntity));
    }

    @GetMapping
    public List<ClassEntity> getAllClasses() {
        return classService.getAllClasses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassEntity> getClassById(@PathVariable Long id) {
        return ResponseEntity.ok(classService.getClassById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return ResponseEntity.ok("Class deleted successfully");
    }
}
