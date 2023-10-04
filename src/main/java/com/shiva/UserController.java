package com.shiva;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

	@RequestMapping("/")
	public String loadForm()
	{
		return "index.html";
	}
	
	@RequestMapping("/insert")
	public String handleForm(@ModelAttribute("user")    User user,Model model )
	{
		
		model.addAttribute("user", user);
		return "view.html";
	}
}
