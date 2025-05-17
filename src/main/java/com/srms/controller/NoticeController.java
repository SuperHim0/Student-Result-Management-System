package com.srms.controller;

import com.srms.entity.Notice;
import com.srms.services.NoticeService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notice")
@CrossOrigin("*")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @PostMapping("/save")
    public ResponseEntity<String> createNote(@RequestBody Notice notice){
        Notice notice1 = noticeService.saveNotice(notice);
        return ResponseEntity.status(HttpStatus.CREATED).body("Notice Created Successfully");
    }
    @PostMapping("/update")
    public ResponseEntity<String> updateNotice(@RequestBody Notice notice){
        Notice notice1 = noticeService.updateNotice(notice);
        return ResponseEntity.status(HttpStatus.CREATED).body("Notice updated Successfully");
    }

    @DeleteMapping("/delete/{noticeId}")
    public ResponseEntity<?> deleteNotice(@RequestParam Long noticeId){
        noticeService.DeleteNotice(noticeId);
        return ResponseEntity.status(HttpStatus.OK).body("Notice Deleted Successfully");
    }


}
