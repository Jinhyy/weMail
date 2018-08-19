package com.example.weMail.Controller;
import com.example.weMail.Model.userModel;
import com.example.weMail.Service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class registerController {
	@Autowired
	userService userService;
	
	@RequestMapping(value="/registerPage")
	public String registerPage(Model model) {
		return "registerPage";
	}
	
	@RequestMapping(value="/registerPage/register",method=RequestMethod.POST)
	public String addStudent(userModel user) {
		userService.registerUser(user);
		return "main";
	}
}
