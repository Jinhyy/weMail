package com.example.weMail.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.weMail.Service.mailService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	mailService mailService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAllMail(Model model) { 
		// Model객체 : 컨트롤러에서 뷰로 전환할 때 데이터를 가지고 있는 객체, 컨트롤러가 뷰로 model 객체를 넘겨 뷰에서 model 객체의 데이터 이용 가능
		model.addAttribute("mailList", mailService.getAllMail());
		System.out.println("list 사이즈 : " + mailService.getAllMail().size());
		return "test";
	}
	
	@RequestMapping(value="/hello")
	public String hello(Model model) {
		return "main";
	}
	
	@RequestMapping(value="/loginPage")
	public String loginPage(Model model) {
		return "loginPage";
	}
}
