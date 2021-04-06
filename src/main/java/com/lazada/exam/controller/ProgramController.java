package com.lazada.exam.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lazada.exam.entity.Program;
import com.lazada.exam.repository.CollegeRepository;
import com.lazada.exam.repository.InstitutionRepository;
import com.lazada.exam.repository.ProgramRepository;

@Controller
public class ProgramController {
	@Autowired
	ProgramRepository progRepo;
	
	@RequestMapping("/program")
    public String home(Model model) {
		List<Program>programList = progRepo.findAll();
		System.out.println(programList);
		for(Program item:programList) {
			System.out.println(item.getCollege().getCollegeName());
			System.out.println(item.getSection());
			System.out.println(item.getStudent());
		}
         model.addAttribute("program", programList);
         return "program";
    }

}
