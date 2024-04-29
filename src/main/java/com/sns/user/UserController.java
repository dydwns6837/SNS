package com.sns.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@GetMapping("/sing-up-view")
	public String singUpView(Model model) {
		model.addAttribute("viewName", "user/signUp");
		return "template/layout";
	}
}
