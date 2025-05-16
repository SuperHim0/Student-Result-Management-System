package com.srms.services.serviceImpl;

import com.srms.entity.SubjectCombination;
import com.srms.repository.SubjectCombinationRepository;
import com.srms.services.SubjectCombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectCombinationServiceImpl implements SubjectCombinationService {
    @Autowired
    private SubjectCombinationRepository repository;

    @Override
    public SubjectCombination saveCombination(SubjectCombination combination) {
        return repository.save(combination);
    }

    @Override
    public void deleteCombination(Long id) {
        repository.deleteById(id);
    }

    @Override
    public SubjectCombination getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<SubjectCombination> getAll() {
        return repository.findAll();
    }
}
