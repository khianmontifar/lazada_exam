package com.lazada.exam.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lazada.exam.repository.InstitutionRepository;

@Controller
public class InstitutionController {
	@Autowired
	InstitutionRepository insRepo;
	
	@RequestMapping("/institution")
    public String home(Model model) {
         model.addAttribute("institution", insRepo.findAll());
         return "institution";
    }

}
