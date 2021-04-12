package com.brendan.thecode;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		String password = "bushido";
		session.setAttribute("pass", password);
		return "index.jsp";
	}
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String tryCode(@RequestParam(value="password") String password, RedirectAttributes redirectAttributes, HttpSession session) {
		System.out.println(session.getAttribute("pass"));
		System.out.println(password);
		String sessionObj = (String) session.getAttribute("pass");
		if (password.equals(sessionObj)) {
			return "redirect:/login";
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	@RequestMapping("/login")
	public String login() {
		return "code.jsp";
	}
}