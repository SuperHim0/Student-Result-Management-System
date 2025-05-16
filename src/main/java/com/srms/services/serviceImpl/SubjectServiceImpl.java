package com.srms.services.serviceImpl;

import com.srms.entity.Subjects;
import com.srms.repository.SubjectRepository;
import com.srms.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;


    @Override
    public Subjects saveSubject(Subjects subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public Subjects getSubjectById(Long id) {
        return subjectRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Subjects> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
