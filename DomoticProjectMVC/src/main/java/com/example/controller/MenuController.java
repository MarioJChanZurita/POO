package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

	@RequestMapping("irMenu")
	public ModelAndView redirection() {
		return new ModelAndView("menu");
	}
	
}
