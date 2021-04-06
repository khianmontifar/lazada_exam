package com.lazada.exam.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lazada.exam.entity.Program;
import com.lazada.exam.entity.Student;
import com.lazada.exam.repository.ProgramRepository;
import com.lazada.exam.repository.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	StudentRepository studRepo;
	
	@Autowired
	ProgramRepository progRepo;
	
	@RequestMapping("/student")
    public String home(Model model) {
		List<Student>studentList = studRepo.findAll();
		System.out.println(studentList);
		List<Program> programList = progRepo.findAll();
		
		
        model.addAttribute("student", studentList);
        model.addAttribute("program", programList);
        return "student";
    }
	
	@RequestMapping("/student/{lastName}")
    public String searchByLastName(Model model, @PathVariable String lastName) {
		List<Student> studentList = new ArrayList<Student>();
		if(lastName==null || lastName.length()==0) {
			studentList = studRepo.findAll();
		}
        studentList = studRepo.findByLastName(lastName);
        model.addAttribute("student", studentList);
        return "student";
    }
	
	@RequestMapping("/student/{lastName}/{firstName}/{programId}")
    public String addStudent(Model model, @PathVariable String lastName, @PathVariable String firstName, @PathVariable Integer programId) {
		
		
		Student student = new Student();
		student.setLastName(lastName);
		student.setFirstName(firstName);
		
		Program program = progRepo.getOne(programId);
		student.setProgram(program);
		
		studRepo.save(student);
		
		List<Student> studentList = studRepo.findAll();
        model.addAttribute("student", studentList);
        return "student";
    }

}
