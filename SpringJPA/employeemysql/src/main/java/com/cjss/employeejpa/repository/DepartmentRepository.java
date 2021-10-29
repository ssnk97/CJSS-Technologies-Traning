package com.cjss.employeejpa.repository;

import com.cjss.employeejpa.entity.DepartmentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentsEntity, Long> {
}
