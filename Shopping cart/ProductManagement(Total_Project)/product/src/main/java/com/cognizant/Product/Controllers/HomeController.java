package com.cognizant.Product.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayWelcomePage() {
		return "welcome";
	}
}
