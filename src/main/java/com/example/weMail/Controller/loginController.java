package com.example.weMail.Controller;
import com.example.weMail.Model.userModel;
import com.example.weMail.Service.userService;
import com.example.weMailSecurity.passwordEncryption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {
	@Autowired
	userService userService;
	
	@RequestMapping(value="/loginPage")
	public String registerPage(Model model) {
		return "loginPage";
	}
	
	@RequestMapping(value="/loginPage/login",method=RequestMethod.POST)
	public String login(userModel user) {
		userService.loginUser(user);
		return "main";
	}
}
