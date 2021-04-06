package com.lazada.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lazada.exam.entity.Program;

public interface ProgramRepository extends JpaRepository<Program, Integer> {

}
