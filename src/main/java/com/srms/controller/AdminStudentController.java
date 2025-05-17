package com.srms.controller;

import com.srms.DTO.Response;
import com.srms.entity.Student;
import com.srms.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/admin/students")
@CrossOrigin("*")
public class AdminStudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<?> registerStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return new ResponseEntity<>(new Response("Student Add success"), HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateStudent(@RequestBody Student student){
        Student updateStudent = studentService.updateStudent(student);
        return new ResponseEntity<>(updateStudent,HttpStatus.ACCEPTED);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getById(id));
    }

    @GetMapping("/roll/{rollId}")
    public ResponseEntity<Student> getByRollId(@PathVariable String rollId) {
        return ResponseEntity.ok(studentService.getByRollId(rollId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted successfully");
    }
}
