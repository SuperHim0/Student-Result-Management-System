package com.srms.services;

import com.srms.entity.ClassEntity;

import java.util.List;

public interface ClassEntityService {
    ClassEntity saveClass(ClassEntity classEntity);
    void deleteClass(Long id);
    ClassEntity getClassById(Long id);
    List<ClassEntity> getAllClasses();
}
