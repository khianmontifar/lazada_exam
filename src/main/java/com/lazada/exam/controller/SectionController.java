package com.lazada.exam.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lazada.exam.entity.Section;
import com.lazada.exam.repository.SectionRepository;

@Controller
public class SectionController {
	@Autowired
	SectionRepository secRepo;
	
	@RequestMapping("/section")
    public String home(Model model) {
		List<Section>sectionList = secRepo.findAll();
		System.out.println(sectionList);
        model.addAttribute("section", sectionList);
        return "section";
    }

}
