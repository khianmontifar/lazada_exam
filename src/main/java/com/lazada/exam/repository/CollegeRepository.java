package com.lazada.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lazada.exam.entity.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {

}
