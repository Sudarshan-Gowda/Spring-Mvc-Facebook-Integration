package com.star.sud.web;

/*@author Sudarshan*/
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(Model model) {

		model.addAttribute("fbUrl", null);
		return "login/login-page";

	}

	@RequestMapping(value = "/star/facebook", method = RequestMethod.GET)
	public String getResultFromFacebook(Model model, ServletRequest request, HttpServletResponse response,
			@RequestParam String email, @RequestParam String firstname, @RequestParam String lastname,
			HttpSession session) {

		model.addAttribute("firstname", firstname);
		model.addAttribute("lastname", lastname);
		model.addAttribute("email", email);

		return "welcome/welcome-page";
	}

}
