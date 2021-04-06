package com.lazada.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lazada.exam.entity.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Integer> {

}
