package com.lazada.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lazada.exam.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query("SELECT U FROM Student U WHERE LOWER(U.lastName) LIKE LOWER(concat(?1, '%'))")
	List<Student> findByLastName(String matchPhrase);

}
