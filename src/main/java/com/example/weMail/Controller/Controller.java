package com.example.weMail.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.weMail.Service.mailService;
import com.example.weMail.Service.deptService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	mailService mailService;
	@Autowired
	deptService deptService;
	

	@RequestMapping(value="/")
	public String mainPage(Model model) {
		model.addAttribute("deptList", deptService.getAllDept());
		System.out.println("list 사이즈 main : " + deptService.getAllDept().size());
		return "main";
	}
	
	@RequestMapping(value="/loginPage")
	public String loginPage(Model model) {
		return "loginPage";
	}
	
	@RequestMapping(value="/registerPage")
	public String registerPage(Model model) {
		return "registerPage";
	}
	
	@RequestMapping(value="/subpage/test")
	public String test(Model model) {
		model.addAttribute("deptList", deptService.getAllDept());
		System.out.println("list 사이즈 : " + deptService.getAllDept().size());
		return "/subpage/test";
	}
}
