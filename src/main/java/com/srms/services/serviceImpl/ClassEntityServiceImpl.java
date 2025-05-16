package com.srms.services.serviceImpl;

import com.srms.entity.ClassEntity;
import com.srms.repository.ClassEntityRepository;
import com.srms.services.ClassEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassEntityServiceImpl implements ClassEntityService {
    @Autowired
    private ClassEntityRepository classRepository;

    @Override
    public ClassEntity saveClass(ClassEntity classEntity) {
        return classRepository.save(classEntity);
    }

    @Override
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }

    @Override
    public ClassEntity getClassById(Long id) {
        return classRepository.findById(id).orElseThrow();
    }

    @Override
    public List<ClassEntity> getAllClasses() {
        return classRepository.findAll();
    }
}
