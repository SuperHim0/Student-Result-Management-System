package com.srms.repository;

import com.srms.entity.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subjects,Long> {
}
