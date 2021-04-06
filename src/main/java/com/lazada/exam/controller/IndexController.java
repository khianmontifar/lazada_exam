package com.lazada.exam.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lazada.exam.entity.Program;
import com.lazada.exam.entity.Student;
import com.lazada.exam.repository.ProgramRepository;
import com.lazada.exam.repository.StudentRepository;

@Controller
public class IndexController {
	@Autowired
	StudentRepository studRepo;
	
	@Autowired
	ProgramRepository progRepo;
	
	@RequestMapping("/")
    public String home(Model model) {
		List<Student>studentList = studRepo.findAll();
		System.out.println(studentList);
		List<Program> programList = progRepo.findAll();
		
		
        model.addAttribute("student", studentList);
        model.addAttribute("program", programList);
        return "index";
    }
	@RequestMapping("/student/lastname/{lastName}")
    public String searchByLastName(Model model, @PathVariable String lastName) {
		List<Program> programList = progRepo.findAll();
		List<Student> studentList = new ArrayList<Student>();
		if(lastName==null || lastName.length()==0) {
			studentList = studRepo.findAll();
		}
        studentList = studRepo.findByLastName(lastName);
        model.addAttribute("student", studentList);
        model.addAttribute("program", programList);
        return "index";
    }
	
	@RequestMapping("/program/programName/{programName}")
    public String filterByProgram(Model model, @PathVariable String lastName) {
		List<Program> programList = progRepo.findAll();
		List<Student> studentList = new ArrayList<Student>();
		if(lastName==null || lastName.length()==0) {
			studentList = studRepo.findAll();
		}
        studentList = studRepo.findByLastName(lastName);
        model.addAttribute("student", studentList);
        model.addAttribute("program", programList);
        return "index";
    }

}
