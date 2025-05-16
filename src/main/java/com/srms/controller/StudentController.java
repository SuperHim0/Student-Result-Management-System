package com.srms.controller;

import com.srms.entity.Student;
import com.srms.services.NoticeService;
import com.srms.services.ResultService;
import com.srms.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private ResultService resultService;
    @Autowired private StudentService studentService;

    @GetMapping("/notices")
    public ResponseEntity<?> getNotices (){
        return ResponseEntity.status(HttpStatus.OK).body(noticeService.getAllNotice());
    }

    //result controller code here
    @GetMapping("/result/{rollNumber}")
    public ResponseEntity<?> findResultByRollNumber(@PathVariable String rollNumber){
        Student student = studentService.findByRollId(rollNumber);
        return ResponseEntity.ok(resultService.findByStudent(student));
    }


}
