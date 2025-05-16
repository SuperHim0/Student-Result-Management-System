package com.srms.services;

import com.srms.entity.SubjectCombination;

import java.util.List;

public interface SubjectCombinationService {

    SubjectCombination saveCombination(SubjectCombination combination);
    void deleteCombination(Long id);
    SubjectCombination getById(Long id);
    List<SubjectCombination> getAll();
}
