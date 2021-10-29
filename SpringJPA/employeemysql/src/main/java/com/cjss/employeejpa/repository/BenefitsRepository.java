package com.cjss.employeejpa.repository;

import com.cjss.employeejpa.entity.BenefitsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenefitsRepository extends JpaRepository<BenefitsEntity, Long> {
}
