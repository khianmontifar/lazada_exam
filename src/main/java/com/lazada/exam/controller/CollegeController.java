package com.lazada.exam.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lazada.exam.repository.CollegeRepository;
import com.lazada.exam.repository.InstitutionRepository;

@Controller
public class CollegeController {
	@Autowired
	CollegeRepository colRepo;
	
	@RequestMapping("/college")
    public String home(Model model) {
         model.addAttribute("college", colRepo.findAll());
         return "college";
    }

}
